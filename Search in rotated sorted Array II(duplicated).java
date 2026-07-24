class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0,r = nums.length-1;
        int m = 0;

        while(l <= r){
            m = l+(r-l)/2;

            if(nums[m] == target){
                return true;
            }
               
            //    handle duplicate
            if (nums[l] == nums[m] && nums[m] == nums[r]) {
                l++;
                r--;
                continue;
            }


            //   search in left sorted part
            
            if(nums[l] <= nums[m]){

               if(nums[l] <= target && target<nums[m]){
                 r= m-1;
            }else{
                l = m+1;
            }
        }

        // search in right sorted part
        else{
            if(target > nums[m] && target <= nums[r]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        }
        return false;
    }
}
