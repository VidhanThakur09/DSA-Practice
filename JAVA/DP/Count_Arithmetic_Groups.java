public class Count_Arithmetic_Groups{

    // Brute Force Approach: Time Complexity: O(n^2) Space Complexity: O(1)
    public int numberOfArithmeticSubarraysBF(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int count = 0;
        int diff = nums[1]-nums[0];
        for(int i = 0;i<nums.length-1;i++){
            
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]-nums[j-1] != diff){
                   break; 
                }
                if(j-i+1 >=3){
                    count++;
                }
            }
        }
        return count;
    }
    // Optimal way: Dynamic Programming
    public int numberOfArithmeticSubarrays(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int count = 0;
        int current = 0;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                current++;
                count+=current;
            }else{
                current = 0;
            }
        }
        return count;
    }
}