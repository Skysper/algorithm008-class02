class Solution {
    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {    
        int[] array = new int[n];
        for(int i=0;i < n;i++) {
            array[i] = i + 1;
        }
        List<Integer> tempList = new ArrayList();
        _generate(tempList, array, 0, k);
        return list;
    }

    private void _generate(List<Integer> current, int[] nums, int pickStart, int kLeft) {
        if(kLeft == 0) {
            list.add(current);
            return;
        }
        if(nums.length - kLeft < 0) {
            return;
        }
        for(int i = pickStart; i <= nums.length - kLeft; i++) {
            List<Integer> listNew = new ArrayList<>(current);
            listNew.add(nums[i]);
            _generate(listNew, nums, i+1, kLeft - 1);
        }
    }

}