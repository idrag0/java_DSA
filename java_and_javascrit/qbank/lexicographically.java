public class LexicographicallyComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println("str1 is lexicographically smaller than str2");
        } else if (result > 0) {
            System.out.println("str1 is lexicographically greater than str2");
        } else {
            System.out.println("str1 and str2 are lexicographically equal");
        }
    }
}
