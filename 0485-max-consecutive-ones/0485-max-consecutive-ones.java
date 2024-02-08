class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                temp++;
            }else{
                temp=0;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}