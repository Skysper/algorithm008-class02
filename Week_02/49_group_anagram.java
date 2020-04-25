class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] array = new int[26];
            for(int i =0;i < s.length();i++) {
                array[s.charAt(i) -'a']++;
            }
            String sHash = Arrays.toString(array);
            if(!map.containsKey(sHash)) {
                map.put(sHash, new ArrayList<String>());
            }
            map.get(sHash).add(s);
        }
        return new ArrayList<>(map.values());
    }
}