class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n = nums.length;
        int[] hash = new int[n+1];
        int[] res = new int[2];

        for(int num: nums){
            hash[num]++;
        }

        for(int i=1; i<hash.length; i++){

            if(hash[i]==2) res[0] = i;
            else if(hash[i]==0) res[1] = i;
        }

        return res;
    }
}