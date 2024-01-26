class Solution {
    public int maxScore(String s) {
        int ans = 0;
        for(int i=0; i<s.length()-1; i++){
            int temp = 0;
            for(int j=0; j<s.length(); j++){
                if(j <= i){
                    if(s.charAt(j) == '0'){
                        temp++;
                    }
                }else{
                    if(s.charAt(j) == '1'){
                        temp++;
                    }
                }
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}