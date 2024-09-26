class Solution {
    public int largestAltitude(int[] gain) {
        int res =0;
        int alt=0;
        for(int climb:gain){
            alt+=climb;
            res=Math.max(res,alt);
        }
        return res;
    }
}
