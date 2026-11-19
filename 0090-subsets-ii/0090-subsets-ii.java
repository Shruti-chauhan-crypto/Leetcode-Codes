class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, new ArrayList<>(), res);
        return res;
    }

    static void solve(int[] nums, List<Integer> ans, List<List<Integer>> res){

        if(nums.length == 0){
            if(!res.contains(ans)) res.add(new ArrayList<>(ans));
            return;
        }

        solve(Arrays.copyOfRange(nums, 1, nums.length), ans, res);
        ans.add(nums[0]);
        solve(Arrays.copyOfRange(nums, 1, nums.length), ans, res);

        ans.remove(ans.size()-1);
    }
}