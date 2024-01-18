package inheritance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing...");
    }
}

public class multi_level {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal class
        puppy.bark(); // Inherited from Dog class
        puppy.play(); // Defined in Puppy class
    }
}
    

