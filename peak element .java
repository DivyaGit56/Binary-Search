class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        int l = 0;
        int h = n-1;
        
        while(l<h){
            int m = l+(h-l)/2;
            
            if(arr[m]<arr[m+1]){
                l = m+1;
            }else{
                h = m;
            }
        }
        return l;
    }
}
