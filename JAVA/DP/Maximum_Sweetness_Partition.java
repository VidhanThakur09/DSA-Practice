public class Maximum_Sweetness_Partition{
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int K = k+1;
        int[]dp = new int[K];
        for(int start = n-1;start>=0;start--){
            int currMax = 0;
            int end = Math.min(n,start+k);
            for(int j = start; j<end;j++){
                currMax = Math.max(arr[j],currMax);
                dp[start%K] = Math.max(dp[start%K],dp[(j+1)%K]+currMax*(j-start+1));
            }
        }
        return dp[0];
    }
}