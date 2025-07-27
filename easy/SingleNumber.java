// Given a non-empty array of integers nums, where every element appears twice except for one, find that single element.
// Key Idea: XOR Properties

// XOR Basics:
// A ^ A = 0 – Any number XORed with itself cancels out.
// A ^ 0 = A – XORing with 0 leaves the number unchanged.
// Commutative & Associative – Order of operations doesn’t matter.
// Why It Works:
// All duplicates (A ^ A) evaluate to 0.
// The single number (B ^ 0) remains B.
// Step-by-Step Example

// For nums = [4, 1, 2, 1, 2]:
// result = 0 ^ 4 = 4  
// result = 4 ^ 1 = 5  
// result = 5 ^ 2 = 7  
// result = 7 ^ 1 = 6  
// result = 6 ^ 2 = 4  - Final answer

  class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
