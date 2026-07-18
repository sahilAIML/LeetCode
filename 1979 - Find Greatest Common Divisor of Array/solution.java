class Solution { 
    public int findGCD(int[] nums) { 
        int minElement = nums[0];
        int maxElement = nums[0];
        
        for (int num : nums) {
            if (num < minElement) minElement = num;
            if (num > maxElement) maxElement = num;
        }
        
        return gcd(minElement, maxElement); 
    } 
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
