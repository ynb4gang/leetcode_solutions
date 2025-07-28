
// Given a sorted array of distinct integers and a target value, return the index where the target would be inserted to maintain the array's order.
// If the target exists, return its index.

// Since the array is sorted, we use binary search to achieve O(log N) time complexity:

//     Initialize left = 0 and right = nums.length - 1.

//     While left <= right:

//         Calculate mid = left + (right - left) / 2 (avoids overflow).

//         If nums[mid] == target, return mid.

//         If nums[mid] < target, search the right half (left = mid + 1).

//         Else, search the left half (right = mid - 1).

//     If the loop ends, left is the insertion index.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
