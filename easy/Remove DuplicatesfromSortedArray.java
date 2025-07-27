// Given a sorted array nums, remove duplicates in-place such that each element appears only once. Return the new length k, and ensure the first k elements of nums contain the unique values.

// Edge Case Handling:
// If the array is empty (nums.length == 0), return 0.
// Two-Pointer Technique:
// k (slow pointer): Tracks the position where the next unique element should be placed. Starts at 1 because the first element is always unique.
// i (fast pointer): Iterates through the array starting from index 1.
// When nums[i] != nums[i-1], it means nums[i] is a new unique element.
// Copy nums[i] to nums[k].
// Increment k.
// Result:
// The first k elements of nums contain all unique values in order.
// Returns k (new length)


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;   
        }
        else {
            int k = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] != nums[i]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }
}
