
class Animal {
    String color = "White";
}

class Dog extends Animal {
    String breed = "Labrador";
}

class Puppy extends Dog {
    String name = "Tommy";

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + super.breed);
        System.out.println("Color: " + super.color);
    }
}

public class par10 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.display();
    }
}
