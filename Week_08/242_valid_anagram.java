class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int[] chars = new int[26];
        for(int i=0;i<sArray.length; i++) {
            chars[sArray[i]-'a']++;
            chars[tArray[i] - 'a']--;
        }

        for(int i = 0; i < chars.length;i++) {
            if(chars[i] != 0) {
                return false;
            }
        }
        return true;

    }
}