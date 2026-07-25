class Solution {
    int floorSqrt(int n) {
        // code here
        
        // BRUTE FORCE
        
        int ans = 0;
        for(int i= 1; i<=n; i++){
            if((long)i*i <= n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
        
        // BINARY SEARCH
        
        if(n == 0 || n == 1)return n;
        
        int l = 0;
        int h = n;
        int ans = 0;
        
        while(l<=h){
            int m = l+(h-l)/2;
            long squr = (long)m*m;
            
            if(squr == n){
                return m;
            }
            
            else if(squr <= n){
                ans = m;
                l= m+1;
                
            }else{
                h = m-1;
            }
        }
        return ans;
    }
}
