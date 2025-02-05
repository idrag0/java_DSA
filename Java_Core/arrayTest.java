package Java_Core;

public class arrayTest {
    public static void main(String[] args) {
        int A[] = {1,3,2,4};
        int B[]= {3,1,2,4};

        int count[] = new int[A.length+1];
        for(int i=0;i<A.length;i++){
            count[A[i]]++;
            System.out.println("idx 1:"+A[i]);
            System.out.println("A "+count[A[i]]);

            count[B[i]]++;
            System.out.println("idx 2:"+B[i]);
            System.out.println("B "+count[B[i]]);
            System.out.println();
        }

    }
}
