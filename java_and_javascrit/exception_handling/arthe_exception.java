package exception_handling;

public class arthe_exception {

    static int sum(int a,int b){
        int sum = a+b;
        return sum/b;
    }


public static void main(String[] args) {  
          
    try{    
         int a[]=new int[5];    
         a[5]=30/0;    
        }    
        // catch(ArithmeticException e)  
        //    {  
        //     System.out.println("Arithmetic Exception occurs");  
        //    }    
        catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }    
        catch(Exception e)  
           {  
            System.out.println("Parent Exception occurs");  
           }             
        System.out.println("rest of the code");    
}  
}  
