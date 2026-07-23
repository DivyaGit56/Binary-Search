class Solution {
    public int search(int[] nums, int target) {
        int l = 0,h = nums.length-1;
        int m = 0;

        while(l<=h){
            m = l+(h-l)/2;

            if(nums[m] == target){
                return m;
            }

            // search in left sorted array
            if(nums[l] <= nums[m]){

                if(target >= nums[l] && target < nums[m] ){
                    h = m-1;
                }else{
                    l = m+1;
                }
            } 
           
        //    search in right sorted array
            else{

                if(target > nums[m] && target <= nums[h] ){
                    l = m+1;
                }else{
                    h = m-1;
                }
            } 

        }
        return -1;
    }
}
