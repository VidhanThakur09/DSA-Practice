public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
    public static void main(String []arg){
        int nums[] = {0,1,0,3,12};
        System.out.println(removeElement(nums,3));
    }
}
