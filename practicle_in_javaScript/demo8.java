public class demo8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append method
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert method
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Delete method
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // Reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Replace method
        sb.replace(6, 11, "GitHub");
        System.out.println("After replace: " + sb);
    }
}
