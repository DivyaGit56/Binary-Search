class Solution {

    public boolean canShip(int [] weights,int days,int capacity){
       int usedDays = 1;
    int currentLoad = 0;

    for (int weight : weights) {

        if (currentLoad + weight <= capacity) {
            currentLoad += weight;
        } else {
            usedDays++;
            currentLoad = weight;
        }
    }

    return usedDays <= days;
}
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        int ans = 0;

        for(int w : weights){
           l = Math.max(l, w);
            h += w;
        }

        while(l<=h){
            int m = l+(h-l)/2;

            if(canShip(weights,days,m)){
                ans = m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}
