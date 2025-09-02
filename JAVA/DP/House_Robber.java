public class House_Robber {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int dp[] = new int[nums.length+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);

        for(int i = 2 ;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],(nums[i]+dp[i-2]));
        }
        return dp[nums.length-1];
    }
    public void main(String arg[]){
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
        
}
