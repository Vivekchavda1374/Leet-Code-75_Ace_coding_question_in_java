
class Solution {
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return dfs(root, root.val);
    }
    
    public int dfs(TreeNode root, int max) {
        if(root == null) {
            return 0;
        }
        max = Math.max(max, root.val);
        int count = root.val >= max ? 1 : 0;
        count += dfs(root.left, max);
        count += dfs(root.right, max);
        return count;
    }
}
