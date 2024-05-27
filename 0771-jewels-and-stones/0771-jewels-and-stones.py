class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        sum = 0
        for a in stones:
            if a in jewels:
                sum+=1
                
        return sum
            