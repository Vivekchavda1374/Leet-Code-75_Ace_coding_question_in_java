public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if(guess(mid)== 0)return mid;
            else if (guess(mid) == 1){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}