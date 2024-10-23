
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=0;
        int maxSum=Integer.MIN_VALUE;
        int maxlevel=0;
        int curlevel=0;
        while(!q.isEmpty()){
            curlevel++;
            count=q.size();
            int sum=0;
            for(int i=0;i<count;i++){
                TreeNode x=q.remove();
                    sum+=x.val;
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            if(maxSum<sum){
                maxSum=sum;
                maxlevel=curlevel;
            }
        }
        return maxlevel;
    }
}
