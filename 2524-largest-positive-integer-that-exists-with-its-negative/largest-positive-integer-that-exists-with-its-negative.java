class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        int max = -1;
        for(int i : nums){
            if(i<0){
                temp.add(i);
            }else{
                if(temp.contains(0-i)){
                    max = Math.max(max, i);
                }
            }
        }
        return max;
    }
}