public class Subset_Sum_Problem {
    static Boolean isSubsetSum(int arr[], int W) {
        boolean dp[][] = new boolean [arr.length+1][W+1];
        
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = true;
        }
        dp[0][0] = true;
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(j>=arr[i-1]){
                    boolean inc =  dp[i-1][j-arr[i-1]];
                    boolean exc = dp[i-1][j];
                    dp[i][j] = (inc || exc);
                }else{
                    boolean exc = dp[i-1][j];
                    dp[i][j] = exc;
                }
            }
        }
        return dp[arr.length][W];
        
    }
}
