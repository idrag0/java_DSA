public class inner_class {
    private int outerVariable = 10;

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("Outer variable: " + outerVariable);
            System.out.println("Inner variable: " + innerVariable);
        }
    }

    public static void main(String[] args) {
        inner_class outer = new inner_class();
        outer.outerMethod();
    }
}
