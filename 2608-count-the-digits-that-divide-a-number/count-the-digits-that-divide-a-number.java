class Solution {
    public int countDigits(int num) {
        int ans = 0;
        
        String temp = "" + num;
        
        for(char c : temp.toCharArray()){
            int x = Integer.parseInt(c + "");
            if(num % x == 0){
                ans += 1;
            }
        }

        return ans;
    }
}