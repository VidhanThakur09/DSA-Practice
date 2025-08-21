public class Move_Zeroes{

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++] = nums[j];
            }
        }
        while(i<nums.length){
            nums[i++] = 0;
        }
    }
    public static void main (String arg[]){
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }
}