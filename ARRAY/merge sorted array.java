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

- explanation----------------------------------------------------------------------------------------------------------

Problem Context

You are given:

nums1 of size m + n, where the first m elements are sorted, and the last n are empty (filled with zeros or placeholders).

nums2 of size n, also sorted.

👉 The goal: merge nums2 into nums1, so that nums1 becomes a single sorted array of size m + n.

Code Explanation
public void merge(int[] nums1, int m, int[] nums2, int n) {


nums1: main array (size m + n)

m: number of valid elements in nums1

nums2: second array (size n)

n: number of elements in nums2

Step 1: Initialize Pointers
int i = m - 1; // pointer for nums1 (last valid element)
int j = n - 1; // pointer for nums2 (last element)
int k = m + n - 1; // pointer for placement at the end of nums1


i starts at the last actual number in nums1.

j starts at the last number in nums2.

k starts at the very end of nums1.

Step 2: Traverse from the End
while (j >= 0) {


Keep looping until all elements of nums2 are placed in nums1.

We don’t need a condition for i >= 0, because if nums1 runs out, we just copy remaining nums2.

Step 3: Compare & Place
if (i >= 0 && nums1[i] > nums2[j]) {
    nums1[k] = nums1[i];
    i--;
} else {
    nums1[k] = nums2[j];
    j--;
}
k--;


If nums1[i] > nums2[j], place nums1[i] at nums1[k].

Otherwise, place nums2[j] at nums1[k].

Decrement the respective pointers (i, j) and the merge pointer k.

Key Idea

Start merging from the end, so we don’t overwrite the elements in nums1 that haven’t been compared yet.

The loop continues until all elements of nums2 are merged.

If nums1 has leftover elements, they’re already in the right place, so no extra copying is needed.

Example Walkthrough

Suppose:

nums1 = [1, 2, 3, 0, 0, 0], m = 3
nums2 = [2, 5, 6], n = 3


i = 2 (nums1[2] = 3)

j = 2 (nums2[2] = 6)

k = 5

Steps:

Compare 3 and 6 → place 6 at nums1[5].

nums1 = [1, 2, 3, 0, 0, 6]


Compare 3 and 5 → place 5 at nums1[4].

nums1 = [1, 2, 3, 0, 5, 6]


Compare 3 and 2 → place 3 at nums1[3].

nums1 = [1, 2, 3, 3, 5, 6]


Compare 2 and 2 → place 2 at nums1[2].

nums1 = [1, 2, 2, 3, 5, 6]


✅ Final result: [1, 2, 2, 3, 5, 6]
