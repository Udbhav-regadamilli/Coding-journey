class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j] == nums[i]) {
                    j++;
                } else {
                    break;
                }
            }
            if ( j < nums.length && nums[i] < nums[i - 1] && nums[i] < nums[j]) {
                ans++;
            }
            if ( j < nums.length && nums[i] > nums[i - 1] && nums[i] > nums[j]) {
                ans++;
            }
        }
        return ans;
    }
}