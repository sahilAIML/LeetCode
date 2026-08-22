class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original = n;

        int i = 0;
        while(n > 0){
            int r = n%10;
            sum += r;
            product *= r;
            n /= 10;
        }

        int total = sum + product;

        if(original%total == 0){
            return true;
        }

        else{
            return false;
        }
    }
}
