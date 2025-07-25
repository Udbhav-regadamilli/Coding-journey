class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        boolean isChecked = false;
        int ans = 0;
        HashSet<Integer> uniqueElements = new HashSet<>();

        for(int i : nums){
            uniqueElements.add(i);
        }

        Integer[] uniqueArray = uniqueElements.toArray(new Integer[0]);
        for(int i : uniqueArray){
            if(i > 0){
                ans += i;
                isChecked = true;
            }
        }

        if(!isChecked){
            ans = nums[0];
            for(int i=1; i<nums.length; i++){
                if(nums[i] > ans){
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}