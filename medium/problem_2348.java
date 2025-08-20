class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length; 
        long cnt = 0;
        long ans = 0;
        for(int num: nums){
            if(num == 0){
                cnt++;
                ans += cnt;
            } else {
                cnt = 0;
            }
        }
        return ans;
    }
}