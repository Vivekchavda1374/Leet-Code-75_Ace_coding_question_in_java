class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;

        for(int i =0; i < grid[0].length; i++){
            int[] n = new int[grid[0].length];
             int s =0;

            for(int[] row:grid){
                n[s] = row[i];
                s++;
            }
        
            for(int[] row:grid){
               if( Arrays.equals(n, row)) count++;
            }
            
        }

        return count;
    }
}
