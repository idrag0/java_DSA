// Write a program to Print Sum of Series 1+x+x2+x3+.......+xn in java

import java.util.Scanner;

public class parQ2_sum {
    public static int power(int n,int x){
        if(n==0){
            return 1;
        }

        // int result=1;
        // for(int i=1;i<=n;i++){
        //     result=result*x;
        // }
        // return result;

        return x*power(n-1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and power");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=power(i, x);
        }
        System.out.println(sum);
    }
}
