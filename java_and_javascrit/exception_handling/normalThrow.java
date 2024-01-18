package exception_handling;

public class normalThrow {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an example exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
