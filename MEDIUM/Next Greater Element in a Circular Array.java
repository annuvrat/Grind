class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];  // This will store the next greater elements
        // Initialize all elements of result[] as -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Loop through the array twice (to simulate circular array)
        for (int i = 0; i < n; i++) {
            // Start from the next element and go around the array circularly
            for (int j = i + 1; j < i + n; j++) {
                int index = j % n;  // Get the correct index in the circular manner
                if (nums[index] > nums[i]) {
                    result[i] = nums[index];
                    break;  // Break as we found the next greater element
                }
            }
        }

        return result;  // Return the array with next greater elements
    }
}
