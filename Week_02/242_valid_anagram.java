class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray,tArray);
        Map<Character, Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        for (char c : sArray) {
            int val = map.getOrDefault(c, 0);
            map.put(c, ++val);
        }

        char[] tArray = t.toCharArray();
        for (char c : tArray) {
            int val = map.getOrDefault(c, 0);
            if(val == 0) {
                return false;
            }
            if(--val == 0) {
                map.remove(c);
            } else {
                map.put(c,val);
            }
        }
        return map.isEmpty();
    }
}