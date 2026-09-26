class Solution {

    public static boolean canMake(int[] bloomDay, int m, int k,int day){
        int flowers = 0;
        int bouquets = 0;

        for(int bloom : bloomDay){
            if(bloom <= day){
                flowers++;
            
            if(flowers == k){
                bouquets++;
                flowers = 0;
            }
        }else{
            flowers = 0;
        }
        }
      return bouquets >= m; 
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int ans = -1;
        int n = bloomDay.length;

        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            l = Math.min(l,bloomDay[i]);
            h = Math.max(h,bloomDay[i]);
        }
        

        while(l<=h){
            int mid = l+(h-l)/2;

            if(canMake(bloomDay,m,k,mid)){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
