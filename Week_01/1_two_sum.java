class Solution {

    // //1、穷举法，双层嵌套循环找到目标值
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0;i< nums.length - 1; i++) {
    //         for(int j = i+1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target) {
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return null;
    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int offset = target - nums[i];
            int value = map.getOrDefault(offset, -1);
            if(value != -1 && value != i) {
                return new int[]{i, value};
            }
        }
        return null;
    }
    
}
