class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int si = 0;
        int gi = 0;

        while(si<s.length && gi<g.length) {
            if(s[si]>=g[gi])
                gi++;
            si++;
        }

        return gi;
    }
}