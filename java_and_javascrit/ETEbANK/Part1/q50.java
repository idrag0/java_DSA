class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set thread name
    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // Display the thread's name and priority
        System.out.println(threadName + " is running with priority: " + Thread.currentThread().getPriority());

        // Simulating some work
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(threadName + " is completed.");
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        // Creating two threads with different priorities
        Thread thread1 = new Thread(new MyRunnable("Thread-1"));
        Thread thread2 = new Thread(new MyRunnable("Thread-2"));

        // Setting higher priority for Thread2
        thread2.setPriority(Thread.MAX_PRIORITY);

        // Starting threads
        thread1.start();
        thread2.start();

        try {
            // Joining threads to ensure they complete before proceeding
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is completed.");
    }
}
