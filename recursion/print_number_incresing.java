package recursion;

import java.util.Scanner;

public class print_number_incresing {

    public static void printNo(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;

        }
        System.out.print(n+" ");
        printNo(n-1);
    }

    public static void printInc(int n){
        if(n==1){
        System.out.print(n+" ");
        return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }

    public static void main(String[] args) {
        Scanner inObj=new Scanner(System.in);
        int n=inObj.nextInt();
         System.out.println("Number in Decreasing order: ");
        printNo(n);
         System.out.println("Number in increasing order: ");
        printInc(n);

        
    }
    
}
