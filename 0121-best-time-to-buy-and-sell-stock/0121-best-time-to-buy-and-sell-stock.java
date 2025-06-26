class Solution {
    public int maxProfit(int[] p) {
        int mp =0;
        int l = 0;
        int r = 1;

        while(r < p.length){
            if(p[r] < p[l]){
                l = r;
            }else{
                mp = Math.max(mp, p[r] - p[l]);
            }
            
            r++;
        }
        return mp;
    }
}