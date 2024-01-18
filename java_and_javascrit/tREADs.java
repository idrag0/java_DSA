public class tREADs {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code to be executed by the thread
            }
        });

        // Get the current state of the thread
        Thread.State state = thread.getState();
        System.out.println("Thread state: " + state);

        // Start the thread
        thread.start();

        // Get the updated state of the thread
        state = thread.getState();
        System.out.println("Thread state: " + state);
    }
}
    

