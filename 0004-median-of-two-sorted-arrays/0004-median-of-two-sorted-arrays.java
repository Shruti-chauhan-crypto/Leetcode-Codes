class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merged[k++] = nums1[i];
                i++;
            } else {
                merged[k++] = nums2[j];
                j++;
            }
        }

        while(i<nums1.length){
            merged[k++] = nums1[i];
            i++;
        }

        while(j<nums2.length){
            merged[k++] = nums2[j];
            j++;
        }

        int mid = (m+n)/2;
        double ans;
        if((m+n)%2 != 0){
            ans = (double) merged[mid];
        } else {
            ans = (double) (merged[mid] + merged[mid-1])/2;
        }

        return ans;
    }
}