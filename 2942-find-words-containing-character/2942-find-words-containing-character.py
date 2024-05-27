class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        array = []

        for index, word in enumerate(words):
            if x in word:
                array.append(index)
                
        return array
                