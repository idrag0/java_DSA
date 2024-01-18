package recursion;
import java.util.*;

import java.util.Scanner;

public class sumOf_N_first_natural {

    public static int  print_Naturalsum(int n){
        int sum=0;
        if(n==0)
        return 0;
       sum=n+print_Naturalsum(n-1);

        return sum;

    }
    public static void main(String[] args) {
        Scanner inObj=new Scanner(System.in);
        System.out.print("Enter Nth term: ");
        int n=inObj.nextInt();
       int ans= print_Naturalsum(n);

       System.out.print("Sum of "+n+" Natural no: = "+ans);
    }
}
