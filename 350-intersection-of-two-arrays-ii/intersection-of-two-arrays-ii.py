class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        temp = Counter(nums1)
        ans = []

        for i in nums2:
            if temp[i] > 0:
                temp[i] -= 1
                ans.append(i)

        return ans
        
        