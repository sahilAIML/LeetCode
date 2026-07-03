class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int idx = high;

        int[] result = new int[nums.length];

        while(low <= high){
            int leftsq = nums[low]*nums[low];
            int rightsq = nums[high]*nums[high];

            if(leftsq > rightsq){
                result[idx] = leftsq;
                low++;
            }

            else{
                result[idx] = rightsq;
                high--;
            }
            idx--;
        }

        return result;
    }
}
