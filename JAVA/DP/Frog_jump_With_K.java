public class Frog_jump_With_K {
    public static int minCost(int[] height,int k) {
        if(height.length == 0){
            return 0;
        }
        int[]dp = new int[height.length+1];
        dp[0] = 0;
        dp[1] = Math.abs(height[1]-height[0]);
        return helper(height.length-1, k ,height,dp);
    }
    public static int helper(int n, int k ,int nums[],int[]dp){
        // int  = Integer.MAX_VALUE;
        for(int i = 1;i<=n;i++){
            int mmSteps = Integer.MAX_VALUE;

            for(int j = 1;j<=k ;j++){
                if(i-j >= 0){
                    int jump = dp[i-j] + Math.abs(nums[i] - nums[i-j]);
                    mmSteps = Math.min(jump,mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n] ;
    }
    public static void main (String arg[]){
        System.out.println(minCost(new int[]{10,20,30,10}, 2));
    }
}
