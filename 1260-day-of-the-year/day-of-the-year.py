class Solution(object):
    def dayOfYear(self, date):
        """
        :type date: str
        :rtype: int
        """
        Y, M, D = map(int, date.split('-'))
        return int((datetime.datetime(Y, M, D) - datetime.datetime(Y, 1, 1)).days + 1)
