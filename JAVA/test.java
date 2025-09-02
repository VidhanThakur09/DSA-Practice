import java.util.*;

public class test {

    public class House_Robber {
        public int rob(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int dp[] = new int[nums.length + 1];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[1], nums[0]);
            int n = nums.length;
            for (int i = 2; i < nums.length + 2; i++) {
                dp[i] = Math.max(dp[i % n - 1], (nums[i % n] + dp[i % n - 2]));
                System.out.println(dp[i]);
            }
            return dp[nums.length - 1];
        }

        public void main(String arg[]) {
            System.out.println(rob(new int[] { 2, 3, 2 }));
        }

    }

}
