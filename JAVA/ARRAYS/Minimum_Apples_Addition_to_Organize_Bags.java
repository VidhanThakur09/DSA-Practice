public class Minimum_Apples_Addition_to_Organize_Bags {
    public static int helper(int[]nums){
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            while(nums[i-1] >= nums[i]){
                count++;
                nums[i]++;
            }
        }
        return count;
    }
    public static void main(String arg[]){
        System.out.println(helper(new int[]{1,5,2,4,1}));
    }
}
