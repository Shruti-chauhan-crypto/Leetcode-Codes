class Solution {

    static int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        solve(nums,target,0);
        return count;
    }

    public void solve(int[] nums, int target, int val){

        if(nums.length==0 && val==target){
            count++;
            return;
        }
        if(nums.length==0 && val!=target){
            return;
        }

        solve(Arrays.copyOfRange(nums,1,nums.length),target,val+nums[0]);
        solve(Arrays.copyOfRange(nums,1,nums.length),target,val-nums[0]);
    }
}