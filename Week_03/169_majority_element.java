class Solution {
    // public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[nums.length/2];
    // }
    public int majorityElement(int[] nums) {
        if(nums.length ==0) return 0;
        if(nums.length == 1) return nums[0];
        Random r = new Random();
        while(true) {
            int val = nums[random(r, nums.length-1, 0)];
            if(isMajority(nums, val)) {
                return val;
            }
        }
    }

    private int random(Random rand, int max, int min) {
        return rand.nextInt(max - min) + min;
    }

    private boolean isMajority(int[] nums, int val) {
        int count = 0;
        for(int i =0;i<nums.length; i++) {
            if(nums[i] == val) {
                count++;
            }
        }
        if(count >= (nums.length + 1)/2) return true;
        return false;
    }

}