class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int max = 0;
        for(int num : potions) if(max < num) max = num;
        int[] p = new int[max+1];
        for(int num : potions) p[num]++;
        for(int i=max-1; i>=0; i--) p[i] += p[i+1];
        for(int i = 0; i < spells.length; i++) {
            long pos = (success + spells[i] - 1 ) / spells[i]; 
            spells[i] = pos <= max ?  p[(int)pos] : 0;
        }
        return spells;
    }
}