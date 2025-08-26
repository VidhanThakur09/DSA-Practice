public class Frog_Jump {
     int count;
    public static int minCost(int[] height) {
        int[]dp = new int[height.length];
        dp[0] = 0;
        return helper(height.length-1,height,dp);
    }
    public static int helper(int n ,int nums[],int[]dp){
        // if(n == 0){
        //     return 0;
        // }
        int right = Integer.MAX_VALUE;
        for(int i = 1;i<=n;i++){
            
            int left = dp[i-1]+Math.abs(nums[i] - nums[i-1]);
            
            if(i>1){
                right = dp[i-2]+Math.abs(nums[i] - nums[i-2]);
            }
            dp[i] = Math.min(left,right);
        }
        return dp[n] ;
    }
    public static void main (String arg[]){
        System.out.println(minCost(new int[]{10,20,30,10}));
    }
}
