package practise;

public class findNomrepeating {

    public static void norepeate(int arr[]){
        int arr2[]=new int[10];
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                arr2[count++]=arr[j];
                }
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}