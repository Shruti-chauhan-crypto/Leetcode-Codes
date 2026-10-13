class Solution {
    public int getMaximumGenerated(int n) {
        
        if(n==0 || n==1) return n;

        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        int maxVal = 1;

        for(int i=1; i<=n/2; i++){
            ans[2*i] = ans[i];
            maxVal = Math.max(maxVal, ans[2*i]);
            if(2*i+1<=n){
                ans[2*i+1] = ans[i] + ans[i+1];
                maxVal = Math.max(maxVal, ans[2*i+1]);
            }
        }

        return maxVal;

    }
}