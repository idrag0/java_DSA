public class fghgfhj9 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.sound(); // Output: Animal makes a sound
        animal2.sound(); // Output: Dog barks
        animal3.sound(); // Output: Cat meows
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
    
}
// A class that demonstrates constructor overloading
class Rectangle {
    // Instance variables
    private int length;
    private int width;

    // Constructor with no parameters
    public Rectangle() {
        // Set default values
        length = 0;
        width = 0;
    }

    // Constructor with one parameter
    public Rectangle(int side) {
        // Set equal values for length and width
        length = side;
        width = side;
    }

    // Constructor with two parameters
    public Rectangle(int length, int width) {
        // Set different values for length and width
        this.length = length;
        this.width = width;
    }

    // A method to calculate the area
    public int getArea() {
        return length * width;
    }
}

// A class to test the Rectangle class
class Main {
    public static void main(String[] args) {
        // Create a Rectangle object using the default constructor
        Rectangle rect1 = new Rectangle();

        // Create a Rectangle object using the one-parameter constructor
        Rectangle rect2 = new Rectangle(10);

        // Create a Rectangle object using the two-parameter constructor
        Rectangle rect3 = new Rectangle(10, 20);

        // Call the getArea method on each object
        System.out.println(rect1.getArea()); // Prints 0
        System.out.println(rect2.getArea()); // Prints 100
        System.out.println(rect3.getArea()); // Prints 200
    }
}
