class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        int[] ans = {0};
        Map<Long, Integer> prefixSum = new HashMap<>();
        dfs(root, prefixSum, 0, targetSum, ans);
        return ans[0];
    }
    
    
    private void dfs(TreeNode root, Map<Long, Integer> prefixSum, long currSum, int targetSum, int[] ans) {
        // Base case
        if (root == null) {
            return;
        }
        // Update curSum
        currSum += root.val;
        // Scenario 1: Check whether the entire path has the desired sum
        if (currSum == targetSum) {
            ans[0]++;
        }
        // Scenario 2: Check whether there is a "subpath" with the desired sum
        // Assume the entire path is [p1, p2, ..., pj], and [pi..j] has the desired sum
        // Then [p1..i-1] will have a sum of currSum - targetSum, which can be obtained from the hashmap
        ans[0] += prefixSum.getOrDefault(currSum - targetSum, 0);
        
        // Update hashmap
        prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        
        // Recursion calls
        dfs(root.left, prefixSum, currSum, targetSum, ans);
        dfs(root.right, prefixSum, currSum, targetSum, ans);
        
        // Reset hashmap after recursion calls
        prefixSum.put(currSum, prefixSum.get(currSum) - 1);
    }
}
