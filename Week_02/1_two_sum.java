class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int offset = target - nums[i];
            if(map.containsKey(offset)) {
                return new int[]{map.get(offset), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    
}