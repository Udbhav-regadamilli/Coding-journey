class Solution(object):
    def findLHS(self, nums):
        nums.sort()
        mx = i = j = 0
        n = len(nums)
        while(i<n and j<n):
            if(nums[j] - nums[i] == 1):
                mx = max((j - i)+1, mx)
                j+=1
            elif(nums[j] - nums[i] < 1):
                j+=1
            else:
                i+=1

        return mx
        