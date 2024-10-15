
class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null){
           return 0;
       } 
       int l = maxDepth(root.left);
       int r =maxDepth(root.right);
       int c = Math.max(l,r);
       return c+1;
    }
}
