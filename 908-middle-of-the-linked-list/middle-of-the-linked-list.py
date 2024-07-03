# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        count = 0
        temp = head
        
        while(temp):
            temp = temp.next
            count+=1

        count //= 2

        temp = head
        for i in range(count):
            temp = temp.next

        return temp
        