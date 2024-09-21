class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]+nums[j]==k){
                i++;
                j--;
                count++;
            }else if(nums[i]+nums[j]<k){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
