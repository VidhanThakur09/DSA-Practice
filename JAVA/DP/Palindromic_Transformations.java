public class Palindromic_Transformations{
    public int minDeletionsForPalindrome(String s) {
        //DP Method
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i = 0;i<n;i++){
            dp[i][i] = 1;
        }
        for(int length = 2;length<=n;length++){
            for(int i = 0;i<=n-length;i++){
                int j = i+length-1;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max( dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return n-dp[0][n-1];
    }
    public int minDeletionsForPalindromePart2(String s) {
        //2 Pointer Approach
        int l = 0,r = s.length()-1,count = 0;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                count++;
                r--;
            }else{
                l++;r--;
            }
        }
        
        return count;
    }
}