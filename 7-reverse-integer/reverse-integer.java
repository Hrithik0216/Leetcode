class Solution {
    public int reverse(int x) {
       long rev = 0;
        int original =x;
        if(x<0){
            original = -1*x;
        }
        while(original>0){
            int r = original%10;
            rev = (rev*10)+r;
            original /=10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int) rev*-1;
        }
        return (int)rev;
    }
}