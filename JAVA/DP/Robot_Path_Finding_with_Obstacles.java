public class Robot_Path_Finding_with_Obstacles {

    // Brute Force Approach: Recursion
    // Time Complexity: O(2^(n*m)) Space Complexity: O(1)

    static int count;
    public int uniquePathsWithObstaclesBruteForce(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        count = 0;
        helper(n,m,grid,0,0);
        return count;
    }
    public static void helper(int n,int m,int[][]matrix , int i ,int j){
        if(i>n-1||j>m-1||matrix[i][j] == 1){
            return;
        }
        if(i == n-1 && j == m-1){
            count+=1;
        }

        helper(n,m,matrix,i+1,j);
        helper(n,m,matrix,i,j+1);
    }



    // Optimal Approach: Dynamic Programming
    // Time Complexity: O(n*m) Space Complexity: O(n*m)
    
    public int uniquePathsWithObstacles(int[][] grid) {
        // int[][] grid = {{0,0,0}, {0,1,0},{0,0,0}};
        int n = grid.length, m = grid[0].length;
        
        // If start or end is blocked → no path
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) {
            return 0;
        }
        
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        
        // Initialize first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = (grid[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;
        }
        
        // Initialize first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = (grid[0][j] == 0 && dp[0][j - 1] == 1) ? 1 : 0;
        }
        
        // Fill the rest of the table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        
        return (dp[n - 1][m - 1]);
    }    
}
