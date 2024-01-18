package practise;

import java.util.Scanner;

public class function_Java {
    static void maths(int a,int b){
        System.out.println(a+b);
         System.out.println(a-b);
          System.out.println(a*b);
           System.out.println(a/b);
    }

    public static void main(String[] args) {
        Scanner inObj = new Scanner(System.in);
        int a= inObj.nextInt();
        int b=inObj.nextInt();
        maths(a, b);
    }
}
