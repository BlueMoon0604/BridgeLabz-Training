public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m - 1;
        int nid = n - 1;
        int right = m + n - 1;
        while(nid >= 0){
            if(mid >= 0 && nums1[mid] > nums2[nid]){
                nums1[right] = nums1[mid];
                mid--;
            }else{
                nums1[right] = nums2[nid];
                nid--;
            }
            right--;
        }
    }
    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        sol.merge(nums1, 3, nums2, 3);
        System.out.println(java.util.Arrays.toString(nums1)); 
        nums1 = new int[]{1};
        nums2 = new int[]{};
        sol.merge(nums1, 1, nums2, 0);
        System.out.println(java.util.Arrays.toString(nums1)); 
        nums1 = new int[]{0};
        nums2 = new int[]{1};
        sol.merge(nums1, 0, nums2, 1);
        System.out.println(java.util.Arrays.toString(nums1)); 
    }
}
