
//The upper bound is the first index where arr[index] > x.

class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int ans = arr.length;
        int l = 0, r = arr.length-1;
        int m = 0;
        
        while(l<= r){
            m = l+(r-l)/2;
            
            if(arr[m] > target){
                ans = m;
                r = m-1;
            }else {
                l = m+1;
            }
        }
        return ans;
    }
}
