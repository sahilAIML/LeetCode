class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] c = new int[n+1];
        int d=-1;
        int m = -1;
        for(int num : nums){
            c[num]++;
        }

        for(int i = 1; i <= n; i++){
            if(c[i] == 2){
                d = i;
            }

            else if(c[i] == 0){
                m = i;
            }
        }

        return new int[]{d,m};
    }
}
