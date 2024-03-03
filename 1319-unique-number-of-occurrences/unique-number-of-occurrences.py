class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """

        dic = {}
        
        for i in arr:
            if i in dic:
                dic[i] += 1
            else:
                dic[i] = 1

        arr = dic.values()
        n = len(arr)

        for i in range(n):
            for j in range(i+1, n):
                if arr[i] == arr[j]:
                    return False
        
        return True
        