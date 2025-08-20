public class Reverse_Pairs{
    
    public static  int reversePairs(int[] nums) {
        if(nums.length<2 || nums == null){
            return 0;
        }
        return mergeSort(0,nums.length-1,nums);
    }
    public static int mergeSort(int s , int e, int[]nums){
        if(s>=e){
            return 0;
        }
        int mid = s+(e-s)/2;
        int count = mergeSort(s,mid,nums) + mergeSort(mid+1,e,nums);
        
        for(int i = s,j = mid+1;i<=mid && j<=e;){
            if(nums[i]>(long)2*nums[j]){
                count+=mid-i+1;
                j++;
            }else{
                i++;
            }
        }
        merger(s,mid,e,nums);
        return count;
    }
    public static void merger(int s,int mid,int e,int[]nums){
        int i = s,j = mid+1,k = 0;
        int[]temp = new int[e-s+1];
        while(i<=mid || j<=e && k<temp.length){
            int nums1 = i>mid?Integer.MAX_VALUE:nums[i];
            int nums2 = j>e?Integer.MAX_VALUE:nums[j];
            temp[k++] = nums1<=nums2?nums[i++]:nums[j++];
        }
        for(k = 0;k<temp.length;k++){
            nums[k+s] = temp[k];
        }

    }
    

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePairs(nums)); // Output: 2
    }
}