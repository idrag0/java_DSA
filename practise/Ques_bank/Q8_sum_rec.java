package Ques_bank;

import java.util.Scanner;

public class Q8_sum_rec {

    public static int sumN(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }

        return n + sumN(n-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println(sumN(n));
    }
}
