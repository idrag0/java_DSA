package exam_practise;

public class sparseMatrix {
    public static void main(String[] args) {
        int sMatrix[][]={
            {0 , 0 , 6 , 0 , 9 },
            {0 , 0 , 4 , 6 , 0 },
            {0 , 0 , 0 , 0 , 0 },
            {0 , 1 , 2 , 0 , 0 } 
        };

        int size=0;
        for(int i=0;i<sMatrix.length;i++){
            for(int j=0;j<sMatrix[i].length;j++){
                if(sMatrix[i][j]!=0)
                size++;
            }
        }

        int Fmat[][]=new int[3][size];
        int k=0;

        for(int i=0;i<sMatrix.length;i++){
            for(int j=0;j<sMatrix[i].length;j++){
                if(sMatrix[i][j]!=0){
                    Fmat[0][k]=i;
                    Fmat[1][k]=j;
                    Fmat[2][k]=sMatrix[i][j];
                    k++;
                }
            }
        }

        for(int i=0;i<Fmat.length;i++){
            for(int j=0;j<Fmat[i].length;j++){
                System.out.print(Fmat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
