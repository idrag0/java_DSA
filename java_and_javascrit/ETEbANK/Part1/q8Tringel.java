package Part1;
public class q8Tringel {

    public static void main(String[] args) {
       int rows = 3;
 
       for (int i = 1; i <= rows; i++) {
          for (int j = rows; j > i; j--) {
             System.out.print(" ");
          }
          for (int k = 1; k <= (2 * i - 1); k++) {
             System.out.print("*");
          }
          System.out.println();
       }
    }
 }
 