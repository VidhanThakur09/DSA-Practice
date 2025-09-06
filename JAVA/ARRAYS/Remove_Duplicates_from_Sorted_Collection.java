import java.util.*;

public interface Remove_Duplicates_from_Sorted_Collection {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        return hs.size();
    }
}
