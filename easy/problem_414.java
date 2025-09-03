import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);  // sort ascending
        int count = 0;
        Integer prev = null; // use null instead of MAX_VALUE
        
        // iterate from largest to smallest
        for (int i = nums.length - 1; i >= 0; i--) {
            if (prev == null || nums[i] != prev) {  // new distinct number
                count++;
                prev = nums[i];
                if (count == 3) return nums[i];  // found third distinct
            }
        }
        
        // less than 3 distinct numbers → return maximum
        return nums[nums.length - 1];
    }
}
