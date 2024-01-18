package array;
import java.util.Scanner;

public class print_arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Scanner input_obj=new Scanner(System.in); //making input object to take inputs of datas

        System.out.println("Elements of array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Enter size of Array: ");
        int n=input_obj.nextInt();

        int afs[]=new int[n];

        System.out.println("Enter the Elements of 2nd Arrays: ");
        for(int j=0; j<n; j++){
            afs[j]=input_obj.nextInt();
        }

        System.out.print("output of 2nd Arrays: ");
        for(int i=0;i<n;i++){
            System.out.print(afs[i]+"  ");
        }




    }
}
