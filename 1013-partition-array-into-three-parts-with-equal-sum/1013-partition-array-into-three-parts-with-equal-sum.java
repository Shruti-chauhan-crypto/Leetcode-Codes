class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int n = arr.length;
        int left = 0;
        for(int i=0; i<n-2; i++){
            int right = 0;
            left += arr[i];
            int j = n-1;

            do{
                right += arr[j];
                j--;
            } while(j>i && right != left);

            if(j==i) continue;
            int mid = 0;
            for(int k=i+1; k<=j; k++){
                mid += arr[k];
            }

            if(mid == left) return true;
        }

        return false;
    }
}