class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Find the minimum length
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < minLen) minLen = s.length();
        }

        StringBuilder lcp = new StringBuilder();

        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) return lcp.toString();
            }
            lcp.append(c);
        }

        return lcp.toString();
    }
}
