/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode solve(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        TreeNode rootRightTree = root.right;
        TreeNode leftLastRight = findLastRight(root.left);
        leftLastRight.right = rootRightTree;
        return root.left;
    }
    TreeNode findLastRight(TreeNode root){
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            return solve(root);
        }
        TreeNode curr = root;
        while(curr!=null){
            if(curr.val>key){
                if(curr.left!=null && curr.left.val==key){
                    curr.left = solve(curr.left);
                    break;
                }
                else{
                    curr = curr.left;
                }
            }
            else{
                if(curr.right!=null && curr.right.val==key){
                    curr.right = solve(curr.right);
                    break;
                }
                else{
                    curr = curr.right;
                }
            }
        }
        return root;
    }
}
