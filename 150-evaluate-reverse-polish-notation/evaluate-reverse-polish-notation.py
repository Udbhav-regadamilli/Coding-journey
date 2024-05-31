class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """

        stack = []

        for i in tokens:
            if i == "+":
                a = int(stack.pop())
                b = int(stack.pop())
                stack.append(a+b)
            elif i == '-':
                a = int(stack.pop())
                b = int(stack.pop())
                stack.append(b-a)
            elif i == '*':
                a = int(stack.pop())
                b = int(stack.pop())
                stack.append(a*b)
            elif i == '/':
                a = int(stack.pop())
                b = int(stack.pop())
                stack.append(int(float(b)/a))
            else:
                stack.append(i)
        return int(stack[0])