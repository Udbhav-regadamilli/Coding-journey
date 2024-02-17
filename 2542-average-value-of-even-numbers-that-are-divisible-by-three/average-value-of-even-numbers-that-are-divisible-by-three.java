class Solution {
    public int averageValue(int[] nums) {
        int avg = 0, count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]%6 == 0){
                avg += nums[i];
                count += 1;
            }
        }

        if(count == 0){
            return 0;
        }

        return avg/count;
    }
}