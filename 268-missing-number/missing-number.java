class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, xor = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}