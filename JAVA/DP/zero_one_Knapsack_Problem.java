public class zero_one_Knapsack_Problem {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int dp[][] = new int[val.length+1][W+1];
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(j>=wt[i-1]){
                    int inc = val[i-1] + dp[i-1][j-wt[i-1]];
                    int exc = dp[i-1][j];
                    dp[i][j] = Math.max(inc ,exc );
                }else{
                    int exc = dp[i-1][j];
                    dp[i][j] = exc;
                }
            }
        }
        return dp[val.length][W];
    }
}
