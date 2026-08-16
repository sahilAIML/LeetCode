class Solution:
    def stoneGameIX(self, stones: list[int]) -> bool:
        count = [0] * 3
        for s in stones:
            count[s % 3] += 1

        if count[0] % 2 == 0:
            return min(count[1], count[2]) > 0
        
        return abs(count[1] - count[2]) > 2
