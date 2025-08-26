public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max = 0;
        for(int i : nums){
            if( i == 1){
                count++;
            }else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
    public static void main (String arg[]){
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,1,1,1,1}));
    }
}
