class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int greatest = 0;
        for(int i=0;i<candies.length;i++){
             greatest = Math.max(candies[i] , greatest);
        }
         for(int i=0;i<candies.length;i++){
             int sum = candies[i] + extraCandies;
             if(sum >= greatest) list.add(true);
             else list.add(false);
        }
        return list;
    }
}
