class Solution {
    public int heightChecker(int[] heights) {
        
        int n = heights.length;
        int[] expected = new int[n];

        for(int i=0; i<n; i++){
            expected[i] = heights[i];
        }

        for(int i=0; i<n-1; i++){
            int swaps=0;
            for(int j=0; j<n-1; j++){
                if(expected[j] > expected[j+1]){
                    int temp = expected[j];
                    expected[j] = expected[j+1];
                    expected[j+1] = temp;
                    swaps++;
                }
            }

            if(swaps==0) break;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if(heights[i]!=expected[i])ans++;
        }

        return ans;
    }
}