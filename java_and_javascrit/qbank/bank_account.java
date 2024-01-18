import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
package qbank;

public class bank_account {
    
}
class BankAccount {
    private double balance;
    private Lock lock;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposit: " + amount + ", Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal: " + amount + ", Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } finally {
            lock.unlock();
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class bank_account {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositThread depositThread1 = new DepositThread(account, 500);
        DepositThread depositThread2 = new DepositThread(account, 1000);
        WithdrawThread withdrawThread1 = new WithdrawThread(account, 200);
        WithdrawThread withdrawThread2 = new WithdrawThread(account, 1500);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}
