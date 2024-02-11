class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Create a DP table to store minimum path sums
        int[][] dp = new int[m][n];
        
        // Initialize the DP table with the value of the starting point
        dp[0][0] = grid[0][0];
        
        // Fill the first row
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        
        // Fill the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        
        // Fill the DP table with the minimum path sums
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        
        // Return the minimum path sum from the top-left to the bottom-right corner
        return dp[m - 1][n - 1];
    }
}
