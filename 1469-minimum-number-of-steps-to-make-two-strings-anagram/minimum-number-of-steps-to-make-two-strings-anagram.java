class Solution {
    public int minSteps(String s, String t) {
        int[] temp = new int[26];

        for(int c : s.toCharArray()){
            temp[c - 97] += 1;
        }

        for(int c : t.toCharArray()){
            temp[c - 97] -= 1;
        }

        int ans = 0;
        for(int i=0; i<26; i++){
            ans += Math.abs(temp[i]);
        }
        
        return ans/2;
    }
}