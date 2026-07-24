class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s = ""
        l1, l2 = len(word1), len(word2)
        l = min(l1, l2)

        for i in range(l):
            s += word1[i]
            s += word2[i]

        if l1<l2:
            for i in range(l, l2):
                s += word2[i]
            return s

        else:
            for i in range(l, l1):
                s += word1[i]
            return s

        return s
