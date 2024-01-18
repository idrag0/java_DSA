package qbank;import java.util.*;


public class pattern7 {
    public static int fabonacci(int n){
        int a=0,b=1,sum=0;
        for(int i=1;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        } 
        return sum;  
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fabonacci(j-1)+" ");
            }
            System.out.println();
        }
}
}
