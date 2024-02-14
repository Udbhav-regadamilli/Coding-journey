class Solution {
    public String largestGoodInteger(String num) {
        int ans = -1;
        for(int i=0; i<=num.length()-3; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                int temp = Integer.parseInt(num.charAt(i)+"");
                ans = Math.max(temp, ans);
            }
        }
        if(ans == -1){
            return "";
        }
        return ans + "" + ans + "" + ans;
    }
}