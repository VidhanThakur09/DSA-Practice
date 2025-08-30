public class Duplicate_Zeros {
    public void duplicateZeros(int[] arr) {
        int []dp = new int[arr.length];
        for(int i = 0,j = 0;i<arr.length && j<dp.length;i++){
            if(arr[i] == 0){
                dp[j++]= arr[i];
                if(j<dp.length){
                    dp[j++] = 0;
                }
            }else {
                dp[j++] = arr[i];
            }
        }

        for(int i = 0;i<dp.length;i++){
            arr[i] = dp[i];
        }
        
    }
}
