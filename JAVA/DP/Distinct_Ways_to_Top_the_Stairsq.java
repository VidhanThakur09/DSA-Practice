public class Distinct_Ways_to_Top_the_Stairsq {
    public int distinctWaysToTop(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int[]dp = new int[n+1];
        dp[0] = 1;dp[1] = 1;

        for(int i = 2;i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}
