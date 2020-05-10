class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i < nums.length; i++) {
            list.add(nums[i]);
        }
        _generator(list, new ArrayList<>());
        return result;
    }

    private void _generator(List<Integer> leftNums, List<Integer> current) {
        if(leftNums.isEmpty()) {
            result.add(current);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i < leftNums.size(); i++) {
            int num = leftNums.get(i);
            if(set.contains(num)) {
                continue;
            }
            set.add(num);
            List<Integer> item = new ArrayList<>(current);
            
            leftNums.remove(i);
            item.add(num);
            _generator(leftNums, item);
            leftNums.add(i, num);
        }
    }
}