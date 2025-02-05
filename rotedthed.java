import java.util.Arrays;
class rotedthed{
    public boolean check(int[] nums) {
        int n = nums.length;
        int newArr[] = new int[n];

        for(int i=0; i<n; i++){
            newArr[i] = nums[i];
        }

        Arrays.sort(newArr);
        int x=0 ;

        for(int i=0; i<n; i++){
            if(nums[0] == newArr[i]){
                x = i;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] != newArr[(i+x)%n]){
                System.out.println(i);
                System.out.println(nums[i]+"  "+newArr[(i+x)%n]);
                System.out.println((i+x)%n+"  "+newArr[(i+x)%n]);
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        rotedthed rt = new rotedthed();
        int[] nums = {5,5,6,6,6,9,1,2};
        System.out.println(rt.check(nums));
    }
}
