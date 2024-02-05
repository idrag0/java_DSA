public class q23 {
    public static void main(String[] args) {
        Integer myInt = 5; // Wrapper class for int
        Character myChar = 'A'; // Wrapper class for char
        Boolean myBool = true; // Wrapper class for boolean

        System.out.println("Integer value: " + myInt);
        System.out.println("Character value: " + myChar);
        System.out.println("Boolean value: " + myBool);
    }
}


public class WrapperClassExample {
    public static void main(String[] args) {
        // Using wrapper classes to convert between primitive and object types
        int primitiveInt = 42;

        // Converting primitive int to Integer object
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Converting Integer object to primitive int
        int backToPrimitiveInt = wrappedInt.intValue();

        System.out.println("Primitive Int: " + primitiveInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("Back to Primitive Int: " + backToPrimitiveInt);

        // Using wrapper classes in a generic context
        Pair<Integer, String> pair = new Pair<>(1, "Hello");
        System.out.println("Generic Pair: " + pair);

        // Handling null values with wrapper classes
        Integer nullableInteger = null;
        System.out.println("Nullable Integer: " + nullableInteger);

        // Using methods provided by wrapper classes
        String intAsString = Integer.toString(123);
        System.out.println("Integer as String: " + intAsString);
    }
}

// A generic class using wrapper classes
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
