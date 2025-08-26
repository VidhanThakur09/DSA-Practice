import java.util.*;

public class Queue_Reconstruction_by_Height{

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)-> a[0] == b[0] ? a[1]-b[1]:b[0]-a[0]);

        ArrayList<int[]>ans = new ArrayList<>();
        for(int i[]:people){
            ans.add(i[1],i);
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void print2d(int[][]nums){
        for(int i[]: nums){
            for(int j :i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int[][]nums = {{7,0},{7,1},{4,4},{5,0},{6,1},{5,2}};
        print2d(reconstructQueue(nums));
    }
}