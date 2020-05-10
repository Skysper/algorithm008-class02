class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> leftNums = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            leftNums.add(nums[i]);
        }
        _generate(leftNums, new ArrayList<>());
        return result;
    }

    public void _generate(List<Integer> leftNums, List<Integer> list) {
        if(leftNums.isEmpty()) {
            result.add(list);
            return;
        }
        for(int i = 0; i < leftNums.size(); i++) {
            int num = leftNums.get(i);
            List<Integer> temp = new ArrayList<>(list);
            temp.add(num);
            leftNums.remove(i);
            _generate(leftNums, temp);
            leftNums.add(i, num);
        }
    }
}