class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0? true: false;
        if(isNegative){
            x = -x;
        }
        int reverse = 0;
        while(x>0){
        int rem = x%10;
        if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) {
            return 0; // Return 0 if reversing x causes overflow
        }
        if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8)) {
            return 0; // Return 0 if reversing x causes overflow
        }
            reverse = (reverse *10)+rem;
            x= x/10;
        }
        
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ){
        return 0 ;
        }
        return isNegative==true? reverse*(-1): reverse;
    }
}