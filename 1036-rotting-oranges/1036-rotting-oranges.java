class Solution{
    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0, freshcnt = 0, mt = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == 2) {
                    q.add(new Pair(row, col, 0));
                    vis[row][col] = 2;
                }
                if (grid[row][col] == 1)
                    freshcnt++;
            }
        }
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().time;
            mt = Math.max(mt, t);
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = r + delRow[i];
                int ncol = c + delCol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    vis[nrow][ncol] = 2;
                    q.add(new Pair(nrow, ncol, t + 1));
                    cnt++;
                }
            }
        }
        if (cnt != freshcnt)
            return -1;
        return mt;
    }
 static class Pair {
    int first;
    int second;
    int time;

    Pair(int first, int second, int time) {
        this.first = first;
        this.second = second;
        this.time = time;
    }
}   
}