package other;
public class find_last_occ {
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int got=lastOcc(arr, key, i+1);
        
        if(key==arr[i] && got==-1){
             return i; 
    }
    return got;
}
       
    
    public static void main(String[] args){
        int arr[]={1,5,3,5};
        int key=5;
        System.out.println(lastOcc(arr,key,0));
}
}
