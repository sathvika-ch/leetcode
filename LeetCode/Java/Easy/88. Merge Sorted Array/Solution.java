class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = new int[m+n];
        System.arraycopy(nums1, 0, mergedArray, 0, m);
        System.arraycopy(nums2, 0, mergedArray, m, n);
        Arrays.sort(mergedArray);
        System.arraycopy(mergedArray, 0, nums1, 0, m + n);
    }
}