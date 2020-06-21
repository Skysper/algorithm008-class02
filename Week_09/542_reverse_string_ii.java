class Solution {
    public String reverseStr(String s, int k) {
        
        char[] array = s.toCharArray();
        
        int base = 0;
        
        flip(base, k, array);
        return new String(array);
    }
    
    private void flip(int base, int k, char[] array) {
        int k2 = 2 * k;
        int length = array.length;
        int offset = length - base;
        if(offset <= 0) {
            return;
        }
        int l = Math.min(offset, k);
        for(int i=0; i < l/2; i++) {
                char temp =  array[base + i];
                array[base + i] = array[base + l - 1 - i];
            array[base + l -1 -i] = temp;
            
        }
        if (offset > k2) {
            flip(base + k2, k, array);
        }
    }
}