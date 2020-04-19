class Solution {
    //2、优化后
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>=0; i--) {
            digits[i]++;
            digits[i] = digits[i] %10;
            if(digits[i] != 0) {return digits;}
        }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        return array;
    }
    //1、暴力破解
    // public int[] plusOne(int[] digits) {
    //     int overflow = 0;
    //     int step = 1;
    //     for(int i=digits.length-1;i>=0;i--) {
    //         int res = digits[i] + step + overflow;
    //         step = 0;
    //         if(res < 10) {
    //             digits[i] = res;
    //             overflow = 0;
    //             break;
    //         } else {
    //             digits[i] = res - 10;
    //             overflow = 1;
    //         }
    //     }

    //     if(overflow == 1) {
    //         int[] array = new int[digits.length + 1];
    //         System.arraycopy(digits,0, array, 1, digits.length);
    //         array[0]= overflow;
    //         digits = array;
    //     }

    //     return digits;
    // }
}
