public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for the end of nums1
        
        // Traverse from the back of nums1 and nums2
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--; 
        }
    }
}
