package java_DSA;

import java.util.Scanner;

public class add_two_matrix {
    
    static void add_Mat(int arr[][],int afs[][]){
        int row1=arr.length;
        int col1=arr[0].length;
        
        int dra[][]=new int[row1][col1];

        for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            dra[i][j]=arr[i][j] + afs[i][j];
        }
        }

        for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            System.out.print(dra[i][j]+" ");
        }
        }

    }

    public static void main(String[] args) {
        Scanner inObj= new Scanner(System.in);

        System.out.println("Enter row size: ");
        int row=inObj.nextInt();
        System.out.println("Enter col size: ");
        int col=inObj.nextInt();

        int arr[][]= new int[row][col];
        int afs[][]= new int[row][col];

        System.out.println("enter the elements of 1St Matrix: ");
        for(int i=0; i<row;i++){
            for(int j=0 ; j<col; j++){
                arr[i][j]=inObj.nextInt();
        }
    }

        System.out.println("enter the elements of 2nd Matrix: ");
        for(int w=0; w<row;w++){
            for(int x=0 ; x<col; x++){
                afs[w][x]=inObj.nextInt();
        }
    }

    add_Mat(arr, afs);
}
}

