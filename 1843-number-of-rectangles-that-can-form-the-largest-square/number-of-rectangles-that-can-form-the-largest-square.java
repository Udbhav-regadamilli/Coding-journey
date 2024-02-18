class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int cnt = 0, mx = 0;
        for(int[] rec : rectangles){
            int temp = Math.min(rec[0], rec[1]);
            if(temp>mx){
                mx = temp;
                cnt = 0;
            }
            if(temp == mx){
                cnt += 1;
            }
        }
        return cnt;
    }
}