class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        sum = 0
        for a in s:
            if s.index(a)!=t.index(a):
                sum = sum + abs(s.index(a) - t.index(a))
        return sum