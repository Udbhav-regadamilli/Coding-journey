class Solution(object):
    def pivotInteger(self, n):
        """
        :type n: int
        :rtype: int
        """

        total_sum = (n*(n+1))//2
        temp = 0
        
        for i in range(1, n+1):
            temp += i

            if(temp == (total_sum - temp + i)):
                return i

        return -1
            

        