import math
from typing import List

class Solution:
    def findKthSmallest(self, coins: List[int], k: int) -> int:
        n = len(coins)

        subset_lcms = []

        for i in range(1, 1 << n):
            current_lcm = 1
            element_count = 0
            
            for j in range(n):
                if (i >> j) & 1:
                    current_lcm = (current_lcm * coins[j]) // math.gcd(current_lcm, coins[j])
                    element_count += 1
            
            subset_lcms.append((current_lcm, element_count))

        def count_multiples_less_than_or_equal(x: int) -> int:
            total = 0
            for lcm_val, count in subset_lcms:
                if count % 2 == 1:
                    total += x // lcm_val
                else:
                    total -= x // lcm_val
            return total

        low = min(coins)
        high = min(coins) * k
        ans = high
        
        while low <= high:
            mid = (low + high) // 2
            
            if count_multiples_less_than_or_equal(mid) >= k:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1  
                
        return ans
