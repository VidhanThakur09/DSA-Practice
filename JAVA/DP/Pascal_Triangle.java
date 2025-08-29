import java.util.*;

public class Pascal_Triangle {
    public List<List<Integer>> generate(int nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == 0) {
            return result;
        }
        if (nums == 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            result.add(temp);
            return result;
        }
        result = generate(nums - 1);
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums; i++) {
            temp.add(1);
        }
        for (int i = 1; i < nums - 1; i++) {
            int top = result.get(nums - 2).get(i);
            int top_left = result.get(nums - 2).get(i - 1);
            temp.set(i, top + top_left);
        }
        result.add(temp);
        return result;
    }
}
