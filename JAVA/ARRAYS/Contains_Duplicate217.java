import java.util.*;
public class Contains_Duplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
    }
    public static void main(String arg[]){
        System.out.println(containsDuplicate(new int[]{1,2,3}));
    }
}
