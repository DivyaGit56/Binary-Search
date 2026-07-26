class Solution {
    
    public boolean canFinish(int []arr,int k,int speed){
        int h = 0;
        
        for(int a:arr){
            h += (a+speed-1L)/speed;
        }
        return h<=k;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int l = 1;
        int h = 0;
        int ans = 0;
        for(int a : arr){
            h = Math.max(h,a);
            
        }
        
        while(l<=h){
            int m = l+(h-l)/2;
            
            if(canFinish(arr,k,m)){
                ans = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
}
