public class Find_the_Lowest_Path_Sum {
    
    public int findLowestPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][]dp = new int[n][m];

        dp[0][0] = grid[0][0];
        for(int i = 1;i<n;i++){
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for(int j = 1;j<m;j++){
            dp[0][j] = grid[0][j]+dp[0][j-1];
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                int nums1 = Integer.MAX_VALUE,nums2 = Integer.MAX_VALUE ;
                if(i-1 >= 0){
                    nums1 = grid[i][j] + dp[i-1][j];
                } 
                if(j-1 >= 0){
                    nums2 = grid[i][j] + dp[i][j-1];
                } 
                dp[i][j] = Math.min(nums1,nums2);
            }
        }
        return dp[n-1][m-1];
    }
}
