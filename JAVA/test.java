import java.util.*;
public class test {

    public static int helperCaller(int[]nums,int k){
        int[]dp = new int[nums.length];
        dp[0] = 0;
        if(nums.length>1){
            dp[1] = Math.abs(nums[0]-nums[1]);
        }
        return helper(nums.length,k,nums,dp);
    }
    public static  int helper(int n,int k,int[]nums,int[]dp){
        for(int i = 2;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1;j<=k;j++){
                if(i-j>0){
                    min = Math.min(min,(dp[i-j] + Math.abs(nums[i]-nums[i-j])));
                }
            }
            dp[i] = min;
        }
        return dp[n-1];
    }
    public static void main (String arg[]){
        System.out.println(helperCaller(new int[]{10,20,30,10}, 2));
    }
}
