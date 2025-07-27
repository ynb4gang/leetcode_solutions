// Given an integer array nums, return true if any value appears at least twice, and false if all elements are distinct.

// Key Steps

// Initialize a HashSet:
// A HashSet stores unique values and allows O(1) average-time lookups.
// Iterate through nums:
// For each num in nums:
// If num is already in seen, return true (duplicate found).
// Otherwise, add num to seen.
// Return false if no duplicates:
// If the loop completes without finding duplicates, return false.

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> seen = new HashSet<>();
    
        for (int num:nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
