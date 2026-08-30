class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        
        int min_idx = 0;
        int max_idx = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[min_idx]) {
                min_idx = i;
            }
            if (nums[i] > nums[max_idx]) {
                max_idx = i;
            }
        }
        
        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);
        
        int del_from_left = right + 1;
        int del_from_right = n - left;
        int del_from_both = (left + 1) + (n - right);
        
        return Math.min(del_from_left, Math.min(del_from_right, del_from_both));
    }
}
