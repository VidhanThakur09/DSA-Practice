// explanation , in this code you have to see how we can achive the the number of stairs in just k steps 
// so for this we use fabonacci approch where we achive number of N element by checking the previous k elements (Like n-1 ,n-2 , n-3 .... n-k)
// so which this we can achive this here the base case is that we have to put Oth and Ith value by hardcode and 
// and here we have to find the dp[i] = Math.abs(previous - current) + dp[i-j] where j is from 1 to k and i from 2 to n-1 

// # mistake -> run loop from 2 or 1 to n-1 in I th not from 0th


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
