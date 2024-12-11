package leetcode_practise;
import java.util.*;

public class q1440_reduce_no_binary {
    public static int toDecimal(int n){
        int decNum =0;
        int rem;
        int i=0;
        while(n !=0){
            rem = n%10;
            n=n/10;
            decNum+=rem*(int)Math.pow(2,i);
            i++;
        }

        return decNum;
    }

    public static int strToint(String s){
        int num=0;
        String [] newstr = s.split(s);
        for(int i=s.length()-1;i<=0;i--){
            num = num + Integer.parseInt(newstr[i])*(int)Math.pow(10, i);
        }
        return num;
    }

    public static int numSteps(String s) {
        int num = toDecimal( strToint(s));
        System.out.println( num);
        int count=0;

        while( num != 0 && num != 1){
            if(num%2==0){
            num = num /2;
            
        }
        else{
            num+=1;
        }
        count++;
        }

        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no: ");
        String s = sc.nextLine();

        System.out.println( numSteps(s));



    }
}
