package recursion;

import java.util.Scanner;

public class fabonacci_series {
    public static int fabo(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        // int fnm1= fabo(n-1);
        // int fnm2= fabo(n-2);

       // int sum=fnm1+fnm2;
    return( fabo(n-1)+fabo(n-2) );

    }

    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=input.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fabo(i)+" ");
        }
    }
}
