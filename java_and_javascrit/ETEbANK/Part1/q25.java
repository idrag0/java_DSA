


class Superclass {
    private int superValue;

    // Superclass constructor
    public Superclass(int value) {
        this.superValue = value;
        System.out.println("Superclass constructor called with value: " + value);
    }

   
}

class Subclass extends Superclass {
    private int subValue;

    // Subclass constructor
    public Subclass(int superValue, int subValue) {
        super(superValue); // Calling the constructor of the superclass

        // Other statements in the subclass constructor
        this.subValue = subValue;
        System.out.println("Subclass constructor called with subValue: " + subValue);
    }

    // Additional method in the subclass
   
}

public class q25 {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Subclass obj = new Subclass(10, 20);

        // Calling methods from both superclass and subclass
       
    }
}


