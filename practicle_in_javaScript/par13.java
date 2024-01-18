class ClassA {
    protected int valueA;

    public ClassA(int valueA) {
        this.valueA = valueA;
    }

    public void displayValueA() {
        System.out.println("Value from ClassA: " + valueA);
    }
}

class ClassB {
    protected int valueB;

    public ClassB(int valueB) {
        this.valueB = valueB;
    }

    public void displayValueB() {
        System.out.println("Value from ClassB: " + valueB);
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface Interface3 {
    void method3();
}

class MyClass extends ClassA implements Interface1, Interface2, Interface3 {
    private int myValue;

    public MyClass(int valueA, int valueB, int myValue) {
        super(valueA);
        this.valueB = valueB;
        this.myValue = myValue;
    }

    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 implementation");
    }

    public void displayMyValue() {
        System.out.println("MyValue: " + myValue);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass(10, 20, 30);
        myObject.displayValueA();
        myObject.displayValueB();
        myObject.method1();
        myObject.method2();
        myObject.method3();
        myObject.displayMyValue();
    }
}
