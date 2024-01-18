package search_Sort;

public class linear_search {
    public static boolean check(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true; 
            }
        }
        return false;    }

        public static void main(String[] args) {
            int arr[]={3,4,2,1,4,5,6};
            int key=5;
            if(check(arr,key)){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
        }
}
