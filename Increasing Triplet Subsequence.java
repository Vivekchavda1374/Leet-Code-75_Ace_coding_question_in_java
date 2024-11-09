class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int i = Integer.MAX_VALUE,j=Integer.MAX_VALUE;
        for(int n = 0 ; n<nums.length;n++){
            if(nums[n]<=i){
            i=nums[n];}
            else if(nums[n]<=j){
                j=nums[n];
            }else {
                return true;
            }
            
        }
        return false;
    }
}
