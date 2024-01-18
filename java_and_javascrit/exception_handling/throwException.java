package exception_handling;

class Drago extends Exception {
    public Drago(String message) {
        super(message);
    }
}

public class throwException {
    public static void main(String[] args) {
        try {
            throw new Drago("Bro not divisible by 0");
        } catch (Drago e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
    
