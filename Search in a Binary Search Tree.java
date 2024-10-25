class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }

        if(root.val == val) {
            return root;
        }
        
        TreeNode answer; // Declaration of answer variable

        if(root.val > val) {
            answer = searchBST(root.left, val);
        } else {
            answer = searchBST(root.right, val);
        }
        
        return answer;
    }
}
