import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        int count = 1;
        for(int i=1; i<n; i++){

            if(nums[i] == nums[i-1]) count++;
            else {

                if(count > n/2) return nums[i-1];
                else count = 1;
            }
        }

        return nums[n-1];

    }
}