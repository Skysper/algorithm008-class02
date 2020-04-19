class Solution {
    //2、双指针法
    //   时间复杂度O(n) 空间复杂度 O(1)
    public void moveZeroes(int[] nums) {
        int index = 0;
        int next = 0;
        while(index < nums.length) {
            if(nums[index] != 0) {
                nums[next] = nums[index];
                next++;
            }
            index++;
        }
        for(int i = next;i<nums.length;i++) {
            nums[i] = 0;
        }
    }
    ////1、暴力破解，从后往前，遇见遇见非0就累加个数，遇见0，就将后面的所有非0，前移1个位置
    //     无0的情况，时间复杂度：O(n)
    //
    //     0和非0间隔交替出现，则移动次数比较多，移动次数为O(n/2)次 (1 + 2 + 3 + 4+... + n/2)
    //     则时间复杂度为O(n^2)
    // public void moveZeroes(int[] nums) {
    //     int offset = 0;
    //     for(int i = nums.length - 1; i >=0;i--) {
    //         if(nums[i] == 0) {
    //             if(offset > 0) {
    //                 System.arraycopy(nums, i + 1, nums, i, offset);
    //                 nums[i + offset] = 0;                }
    //         } else {
    //             offset++;
    //         }
    //     }
    //}
}
