public class House_Robber_II {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(getmax(nums,0,nums.length-2) , getmax(nums,1,nums.length-1));
    }
    public int getmax(int[]nums,int start,int end){
        int prev = 0, maxRob = 0;

        for(int i = start;i<=end ;i++){
            int temp = Math.max(maxRob,prev+nums[i]);
            prev = maxRob;
            maxRob = temp;
        }
        return maxRob;
    }
    public void main(String arg[]){
        System.out.println(rob(new int[]{2,3,2}));
    }
}
