class Solution {
    public void backtrack(int[] nums, int index, long max_or, long curr_or, int[] ans) {
        if (curr_or == max_or) {
            ans[0]++;
        }

        for (int i = index; i < nums.length; i++) {
            backtrack(nums, i + 1, max_or, curr_or | nums[i], ans);
        }
    }

    public int countMaxOrSubsets(int[] nums) {
        long max_or = 0;
        for (int i : nums) {
            max_or |= i;
        }
        int[] ans = new int[1];
        backtrack(nums, 0, max_or, 0, ans);
        return ans[0];
    }
}