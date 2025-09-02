class Solution {
    public boolean isPalindrome(int x) {
        String reversed = new StringBuffer(Integer.toString(x)).reverse().toString();

        return(Integer.toString(x).equals(reversed));
    }
}