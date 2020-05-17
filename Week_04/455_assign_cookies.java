class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length -1;
        int m = s.length -1;
        int sum = 0;
        while(i >= 0 && m >= 0 ) {
            if(s[m] >= g[i]) {
                m--;
                sum++;
            }
            i--;
        }
        return sum;
    }
}