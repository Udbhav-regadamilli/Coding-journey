class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return Math.max((num+t+t), (num-t-t));
    }
}