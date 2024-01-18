public class par12 {
    public static class LowAmountException extends Exception {
        public LowAmountException(String message) {
            super(message);
        }
    }

    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        public void withdraw(double amount) throws LowAmountException {
            if (amount > balance) {
                throw new LowAmountException("Insufficient balance in the account");
            }
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            account.withdraw(1500.0);
        } catch (LowAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
}
