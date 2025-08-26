// do it again



public class Range_Sum_Query_Mutable302{

    public static class node{
        int[]nums;
        int n;
        int[]tree;
        int diff;

        node(int[]nums){
            this.nums = nums;
            this.n = nums.length;
            this.tree = new int[4*n];
        }
        public int build(int[]nums,int i,int start,int end){
            if(start == end){
                return this.tree[i] = nums[start];
            }
            int mid = start+(end-start)/2;
            int left = build(nums,2*i+1,start,mid);
            int right = build(nums,2*i+2,mid+1,end);
            return tree[i] = left+right;
        }
        public void update (int i,int index,int start,int end,int diff){
            if(index>end || index<start){
                return;
            }
            tree[i] +=diff;
            if(start!=end){
                int mid = start+(end-start)/2;
                update(i*2+1,index,start,mid,diff);
                update(i*2+2,index,mid+1,end,diff);
            }
        }
        public int getElement(int start,int end,int q1,int i){
            if(start == end){
                return tree[i];
            }
            int mid = start+(end-start)/2;
            if(q1<=mid){
                return getElement(start, mid, q1, 2*1+1);
            }
            else{
                return getElement(mid+1, end, q1, 2*1+2);
            }
        }
        public int sum(int i ,int start,int end,int q1,int q2){
            if(q1<start || q2>end){
                return 0;
            }else if(q1 == start && q2 == end){
                return tree[i];
            }else{
                int mid = start+(end-start)/2;
                int left = sum(2*i+1,start,mid,q1,q2);
                int right = sum(2*i+2,mid+1,end,q1,q2);
                return left+right;
            }
        }
    }
    static node root;
    public static void NumArray(int[] nums) {
        root = new node(nums);
        root.build(nums,0,0,nums.length-1);
     }
    public static void update(int index, int val){
        int diff = val-root.getElement(0,root.n-1,index,0);
        root.update(0, index, 0,root.n-1 , diff);
    }
    public static  int sum(int left,int right){
        return root.sum(0, 0, root.n-1, left, right);
    }
    public static void main(String[]args){
        int[]nums = {1,3,5};
        NumArray(nums);
        update(1, 2);
        int sum = sum(0,2);
        System.out.println(sum);
    }
}