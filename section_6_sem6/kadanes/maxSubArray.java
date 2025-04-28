package kadanes;

public class maxSubArray {
    int maxSubArray(int [] nums){
        int n = nums.length;
        int preMax = nums[0];
        int max = nums[0];

        for(int i=1; i<n; i++){
            int currSum = Math.max(nums[i], nums[i]+preMax);
            max = Math.max(max, currSum);
        }
    }
}
