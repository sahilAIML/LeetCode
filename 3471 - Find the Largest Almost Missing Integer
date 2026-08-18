import java.util.HashMap;
import java.util.Map;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        if (k == n) {
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        if (k == 1) {
            int max = -1;
            for (int num : nums) {
                if (freqMap.get(num) == 1) {
                    max = Math.max(max, num);
                }
            }
            return max;
        }
        
        int ans = -1;
        if (freqMap.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (freqMap.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        
        return ans;
    }
}
