
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

public class SleepExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000); // Pause for 1000 milliseconds (1 second)
                System.out.println("Thread 1 has finished sleeping.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
                System.out.println("Thread 2 has finished sleeping.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
