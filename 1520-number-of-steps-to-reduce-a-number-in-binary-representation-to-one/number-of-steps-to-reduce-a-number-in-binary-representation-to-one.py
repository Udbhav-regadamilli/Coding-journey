class Solution(object):
    def numSteps(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        val = int(s, 2)

        while val > 1:
            if val%2 == 0:
                val /= 2
            else:
                val += 1
            ans += 1
        
        return ans
        