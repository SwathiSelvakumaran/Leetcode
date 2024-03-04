class Solution(object):
    def bagOfTokensScore(self, tokens, power):
        """
        :type tokens: List[int]
        :type power: int
        :rtype: int
        """

        tokens.sort()
        score = 0
        max_score = 0
        left = 0
        right = len(tokens) - 1

        while left <= right:
            if power >= tokens[left]:
                power -= tokens[left]
                score += 1
                max_score = max(max_score, score)
                left += 1
            elif score > 0:
                power += tokens[right]
                score -= 1
                right -= 1
            else:
                break

        return max_score
