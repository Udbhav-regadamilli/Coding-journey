class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        if(n<3){
            return s;
        }
        for(int i=0; i<n-3; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                continue;
            }
            ans.append(s.charAt(i));
        }
        if(s.charAt(n-3) == s.charAt(n-2) && s.charAt(n-2) == s.charAt(n-1)){
            ans.append(s.charAt(n-2));
            ans.append(s.charAt(n-1));
        }else{
            ans.append(s.charAt(n-3));
            ans.append(s.charAt(n-2));
            ans.append(s.charAt(n-1));
        }
        return ans.toString();
    }
}