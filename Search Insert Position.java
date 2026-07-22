//Return the index where the target is found.
//If it isn't found, return the position where it should be inserted to keep the array sorted.

// Binary Search Approach
//r points to the last element < target
//l points to the first element ≥ target

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return l;
    }
}


// Lower Bound Approach
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target)
                ans = m ;
              r = mid-1;
            
            else
                r = mid + 1;
        }

        return ans;
    }
}
