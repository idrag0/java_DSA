package Part1;

public class q1 {
    private static final int MAX_COUNT = 10;
    private transient String data;
    private static int counter = 0;
    private final Object lock = new Object();

    public q1(String data) {
        this.data = data;
    }

    public void printData() {
        synchronized (lock) {
            System.out.println("Data: " + data);
        }
    }

    public static void incrementCounter() {
        synchronized (q1.class) {
            if (counter < MAX_COUNT) {
                counter++;
                System.out.println("Counter: " + counter);
            }
        }
    }

    public static void main(String[] args) {
        q1 obj = new q1("Hello");
        obj.printData();
        incrementCounter();
    }
}
