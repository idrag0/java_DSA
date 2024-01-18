class Inner2 {
    private int x = 1;

    class MIClass { // inner class definition
        public void seeOuter() {
            System.out.println("Outer Value of x is: " + x);
        }
    } // close inner class definition

    public static void main(String[] args) {
        Inner2.MIClass inner = new Inner2().new MIClass();
        inner.seeOuter();
    }
}
