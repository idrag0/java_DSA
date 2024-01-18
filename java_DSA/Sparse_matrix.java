package java_DSA;

public class Sparse_matrix {
    
    static void check_sparse(int arr[][]){
         int row=arr.length;
        int col=arr[0].length;
        int count=0;
        int size=row*col;

        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++){
                count++;
            }
        }

        if(count>size/2){
            System.out.println("Sparse Matrix");
        }
        else{
            System.out.println("not Sparse Matrix");
        }
    }

    public static void main(String[] args) {
        int arr[][]={{4,0,0},{0,5,0},{0,0,6}};

        check_sparse(arr);

    }
}
