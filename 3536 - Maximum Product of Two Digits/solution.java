class Solution {
    public int maxProduct(int n) {

        if(n < 10){
            return 0;
        }

        int f = 0;
        int s = 0;

        while(n>0){
            int r = n%10;
            if(r > f){
                s = f;
                f = r;
            }
            else if(r > s){
                s = r;
            }

            n = n/10;
        }
        return f*s;
    }
}
