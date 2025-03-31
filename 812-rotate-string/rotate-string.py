class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """

        i=0
        temp = s
        length = len(s)
        while(i<length):
            temp = temp[1:length] + temp[0]
            if temp == goal:
                return True
            i+=1
        return False