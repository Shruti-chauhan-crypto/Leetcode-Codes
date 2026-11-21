class Solution {

    static int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        solve(nums,target,0,0);
        return count;
    }

    public void solve(int[] nums, int target, int idx, int val){

        if(idx==nums.length){
            if(val==target){
                count++;
            }

            return;
        }

        solve(nums,target,idx+1,val+nums[idx]);
        solve(nums,target,idx+1,val-nums[idx]);
    }
}