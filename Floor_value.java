class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int l = 0,r=arr.length-1;
        int m = 0;
        int ans = -1;
        
        while(l<=r){
            m = l+(r-l)/2;
            
            if(arr[m]<=x){
                ans = m;
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return ans;
    }
}
