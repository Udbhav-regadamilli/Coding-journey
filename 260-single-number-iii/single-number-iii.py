class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        ans = []

        for i in nums:
            if nums.count(i) == 1:
                ans.append(i)
            
            if(len(ans) == 2):
                return ans

        return ans