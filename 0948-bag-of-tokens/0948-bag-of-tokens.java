class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxScore = 0;
        int left = 0;
        int right = tokens.length - 1;

        Arrays.sort(tokens);

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left++];
                maxScore = Math.max(maxScore, ++score);
            } else if (score > 0) {
                power += tokens[right--];
                score--;
            } else {
                break;
            }
        }

        return maxScore;
    }
}