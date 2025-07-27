// How the Algorithm Works

// The goal is to find two indices in an array nums where the corresponding numbers add up to a given target.

// Hash Map for Tracking Complements
// We use a HashMap<Integer, Integer> to store each number we’ve seen (nums[i]) along with its index (i).
// For each number nums[i], we compute its complement (target - nums[i]).
// If the complement exists in the map, we’ve found our pair:
// map.get(complement) → index of the first number.
// i → current index (second number).
// If not, we store nums[i] and its index in the map for future checks.
// Efficiency
// Time: O(n) (single pass through the array).
// Space: O(n) (worst case, we store all elements in the map).

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> del = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (del.containsKey(target - nums[i])) {
                return new int[]{del.get(target - nums[i]), i};
            }
            del.put(nums[i], i);
        }
        return new int[0];
    }
}
