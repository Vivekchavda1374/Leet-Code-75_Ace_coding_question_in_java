class Solution {
    public int tribonacci(int n) {
        
        if(n<=2){
            return (n==0)?0:1;
        }
        int t0 = 0,t1 =1,t2 =1, ans =0;
        for(int i=3;i<=n;i++){
            ans = t2 + t1 + t0;
            t0 = t1;
            t1 = t2;
            t2 = ans;
        }
        return ans;
    }
}