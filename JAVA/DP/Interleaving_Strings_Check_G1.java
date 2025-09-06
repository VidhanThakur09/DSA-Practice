public class Interleaving_Strings_Check_G1 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        
        if(n+m != s3.length()){
            return false;
        }
        boolean dp[][] = new boolean [n+1][m+1];
        
        dp[0][0] = true;
        
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<m+1;j++){
                if(i>0){
                    dp[i][j] |=  (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }
                if(j>0){
                    dp[i][j] |=  (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
                
            }
        }
        return dp[n][m];
    }
}
