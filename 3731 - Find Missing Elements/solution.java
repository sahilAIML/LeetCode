import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.add(i);
            }
        }

        return ans;
    }
}
