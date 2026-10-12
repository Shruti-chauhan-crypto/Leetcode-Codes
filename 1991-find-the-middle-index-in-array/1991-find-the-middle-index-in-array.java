class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }

        int left = 0;
        int right = 0;
        for(int i=0; i<n; i++){

            if(i>0) left = nums[i-1];
            right = nums[n-1] - nums[i];

            if(left==right) return i;
        }

        return -1;
    }
}