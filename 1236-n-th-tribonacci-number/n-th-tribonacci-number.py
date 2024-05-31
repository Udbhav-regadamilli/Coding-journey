class Solution(object):
    memo = [0, 1, 1]
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < len(Solution.memo):
            return Solution.memo[n]
        Solution.memo.append(self.tribonacci(n-3) + self.tribonacci(n-2) + self.tribonacci(n-1))
        return Solution.memo[n]
        