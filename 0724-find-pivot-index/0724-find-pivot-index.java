class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }

        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<n; i++){

            if(i==0) leftSum = 0;
            else leftSum = nums[i-1];
            rightSum = nums[n-1] - nums[i];

            if(leftSum == rightSum) return i;
        }

        return -1;
    }
}