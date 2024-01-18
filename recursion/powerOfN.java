package recursion;
import java.util.*;

public class powerOfN {
    //recursion function
    public static int power(int n,int x){
        //base case
        if(n==0)
        return 1;
 
        //recursive relation
        int smallerP=power(n-1,x );
        int biggerP=x*smallerP;

        return biggerP;
    }

    public static void main(String[] args) {
        int n;

        Scanner obj = new Scanner(System.in);

         
        System.out.print("Enter no : ");
        int x=obj.nextInt();

        System.out.print("Enter power : ");
        n=obj.nextInt();
        int ans  = power(n,x);
        System.out.print("Answer = "+ans);
    }
}
