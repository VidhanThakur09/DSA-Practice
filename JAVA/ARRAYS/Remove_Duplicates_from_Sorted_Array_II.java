import java.util.HashMap;

public class Remove_Duplicates_from_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = 0;
        for (int num:nums) {
            hm.put(num,hm.getOrDefault(num,0)+1);
            if (hm.get(num) <= 2 ) {
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
    public static void main(String[] arg){
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
