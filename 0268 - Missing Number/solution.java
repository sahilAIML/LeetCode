class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){ // get sum of an array
            sum = sum + nums[i];
        }

        int f = n*(n+1)/2; //formual : to get sum of all nums 0 to n
        return f-sum;
    }
}
