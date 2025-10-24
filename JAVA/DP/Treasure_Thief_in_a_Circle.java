public class Treasure_Thief_in_a_Circle {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
    public static int helper(int nums[],int s,int e){
        int house1 = 0,house2 = 0;
        for(int i = s;i<=e;i++){
            int temp = Math.max(house1+nums[i],house2);
            house1 = house2;
            house2 = temp;
        }
        return house2;
    }
}
