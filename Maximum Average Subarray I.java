class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double maxAvgWindow = sum/k;

        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxAvgWindow = Math.max(maxAvgWindow, sum/k);
        }

        return maxAvgWindow;
    }
}
