class Solution(object):
    def replaceWords(self, dict, sentence):
        """
        :type dict: List[str]
        :type sentence: str
        :rtype: str
        """
        setenceAsList = sentence.split(" ")
        for i in range(len(setenceAsList)):
            for j in dict:
                if setenceAsList[i].startswith(j):
                    setenceAsList[i] = j
        return " ".join(setenceAsList)