class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0, r = 1;
        
        while (!good(piles, h, r)) {
            r *= 2;
        }
        
        while (r > l + 1) {
            int mid = (r + l) >>> 1;
            if (good(piles, h, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        
        return r;
    }
    
    private boolean good(int[] piles, int h, int x) {
        long hours = 0;
        for (int i : piles) {
            hours += (i + x - 1) / x;
        }
        return hours <= h;
    }
}