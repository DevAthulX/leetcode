class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        Arrays.sort(nums);
        return nums[1];

    }
}
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        for (int num : nums) {
            if (num != min && num != max) return num;
        }
        return -1;
    }
}
