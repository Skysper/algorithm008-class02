//1、暴力移动，每次各个元素移动1步，总已从k次 O(n^2) 空间复杂度 O(1)
//2、开辟新的数据，按照位置进行转移 System.arraycopy 时间复杂度O(n) 空间复杂度O(n)
//3、进行三次数组内反转（参考题解）O(n) 空间复杂度O(1)
class Solution {
    // public void rotate(int[] nums, int k) {
    //     k = k % nums.length;
    //     if(nums.length <=1 || 0 == k) {
    //         return;
    //     }
    //     for(int i=0; i<k; i++) {
    //         int prev = nums[nums.length -1];
    //         for(int j = 0; j < nums.length; j++) {
    //             int temp = nums[j];
    //             nums[j] = prev;
    //             prev= temp;
    //         }
    //     }
    // }

    // public void rotate(int[] nums, int k) {
    //     k = k % nums.length;
    //     if(nums.length <=1 || 0 == k) {
    //         return;
    //     }
    //     int[] array = new int[k];
    //     int index = 0;
    //     int mid = nums.length - k;
    //     int last = nums.length - k;
    //     System.arraycopy(nums, last, array, 0, k);
    //     System.arraycopy(nums, index, nums, k, mid);
    //     System.arraycopy(array, 0, nums, 0, k);
    // } 

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(nums.length <=1 || 0 == k) {
            return;
        }
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
