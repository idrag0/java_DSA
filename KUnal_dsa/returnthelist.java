import java.util.ArrayList;

public class returnthelist {

    static ArrayList<Integer> findallIndex(int []arr, int terget, int idex){
        ArrayList<Integer> list = new ArrayList<>();

        if(idex==terget){
            return list;
        }

        if(arr[idex]==terget){
            list.add(idex);
        }


        ArrayList<Integer> ansFromlowCalls =  findallIndex(arr,terget,idex+1);

        list.addAll(ansFromlowCalls);

        return list;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,10,10,13,14,15,16,17,18,10,10,19,20};
        int target = 10;
        ArrayList<Integer> ans = findallIndex(arr,target,0);
        System.out.println(ans);
    }

}
