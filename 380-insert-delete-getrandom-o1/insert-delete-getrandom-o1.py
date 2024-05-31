class RandomizedSet(object):

    def __init__(self):
        self.s = set()

    def insert(self, val):
        """
        :type val: int
        :rtype: bool
        """
        if val in self.s:
            return False
        else:
            self.s.add(val)
            return True

    def remove(self, val):
        """
        :type val: int
        :rtype: bool
        """
        if val not in self.s:
            return False
        else:
            self.s.remove(val)
            return True
        

    def getRandom(self):
        """
        :rtype: int
        """
        return random.choice(list(self.s))  


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()