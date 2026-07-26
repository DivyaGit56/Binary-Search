class Solution {
    
    public boolean canPlace(int []arr,int k,int guess){
        int cnt = 1;
        int lastPlaced = arr[0];
        for(int i = 1; i<arr.length; i++){
        if(arr[i]-lastPlaced >= guess){
            cnt++;
            lastPlaced = arr[i];
            
            
            if(cnt == k){
                return true;
            }
        }
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        int ans = 0;
        int l = 1;
        int h = arr[n-1]-arr[0];
        int m = 0;
        
        while(l<=h){
            m = l+(h-l)/2;
            
            if(canPlace(arr,k,m)){
                ans = m;
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return ans;
    }
}
