package Java_Core;

public class substringFuction {
    
    public static void main(String[] args) {
        String str = "Hello";
        int size = str.length();
        String left ;
        String right;

        for (int i = 1; i < size; i++) {
            left = str.substring(0, i);
            right = str.substring(i, size);
            System.out.println("left : "+left);
            System.out.println("right : "+right);
        }
    }
}
