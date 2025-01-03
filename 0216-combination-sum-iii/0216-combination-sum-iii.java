class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result = new ArrayList<>();
        findCombination(1,n,k,new ArrayList<>(),result);
        return result;
    }
    public void findCombination(int start , int target , int size 
    , List<Integer> comb , List<List<Integer>> result) {
        
        if(target == 0 ) {
            if( comb.size() == size) {
                result.add(new ArrayList<>(comb));
            }
            return;
        }
        for(int i = start ; i <= 9 ; i++) {
            if(i <= target ) {
                comb.add(i);
                findCombination(i+1,target - i, size , comb, result);
                comb.remove(comb.size() - 1);
            }
            else {
                break;
            }

        }

             
        }
    }
    