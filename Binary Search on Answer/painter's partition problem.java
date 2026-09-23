class Solution {
    
    public static boolean canPaint(int[]arr,int k, int guess){
        int usedPainter = 1;
        int currLenPaint = 0;
        
        for(int a : arr){
        if(currLenPaint+a<= guess){
            currLenPaint += a;
        }else{
            usedPainter++;
            currLenPaint = a;
        }
        }
        return usedPainter <= k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int l = arr[0];
        int h = 0;
        
        int ans = 0;
        
        for(int a : arr){
            l = Math.max(l,a);
            h += a;
        }
        
        
        while(l<=h){
            
        int m = l+(h-l)/2;
        
        if(canPaint(arr,k,m)){
            ans = m;
            h = m-1;
        }else{
            l = m+1;
        }
        }
        return ans;
    }
}
