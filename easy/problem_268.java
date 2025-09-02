class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int che = 0;
        for (int a : nums) {
            che += a;
        }
        return sum - che;
    }
}
