package ADA_Lab;

import java.util.Scanner;

public class rec_fabonacci {
    public static int fabonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fabonacci(n-1)+fabonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the value: ");
        int n=sc.nextInt();

            System.out.print("Nth term of "+n+" = "+fabonacci(n));
    }
}