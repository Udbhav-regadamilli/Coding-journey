class Solution:
    def makeFancyString(self, s: str) -> str:
        if len(s) < 3:
            return s

        n = len(s)
        ans = ""
        
        for i in range(0, n-3):
            if s[i] == s[i+1] and s[i+1] == s[i+2]:
                continue
            ans += s[i]

        if s[n-3] == s[n-2] and s[n-2] == s[n-1]:
            ans += s[n-2:]
        else:
            ans += s[n-3:]

        return ans

        