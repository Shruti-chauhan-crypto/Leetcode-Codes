class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }

    public static void solve(int nums[], int idx, List<List<Integer>> ans){

        if(idx==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int a:nums){
                list.add(a);
            }
            ans.add(list);
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(nums,idx,i);
            solve(nums,idx+1,ans);
            swap(nums,i,idx);
        }
    }

    static void swap(int nums[], int idx, int i){
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }
}