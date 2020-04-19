class Solution {
    //1.暴力求解
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     System.arraycopy(nums2, 0, nums1, m , n);
    //     Arrays.sort(nums1);
    // }

    //1、双指针头部处理需要额外的空间保存被替换数据
    //2、双指针尾部开始处理
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int pos = m + n -1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[pos] = nums1[i];
                i--;
            } else {
                nums1[pos] = nums2[j];
                j--;
            }
            pos--;
        }
        if(j>=0) {
            for(int q =0; q<=j; q++) {
                nums1[q] = nums2[q];
            }
        }
    }
}
