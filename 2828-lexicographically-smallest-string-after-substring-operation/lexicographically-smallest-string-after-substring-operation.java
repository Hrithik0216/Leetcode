class Solution {
    public String smallestString(String s) {
        int i =0;
        int n = s.length();
        while(i<n && s.charAt(i)=='a'){
            i++;
        }
       if (i == n) {
            // If the string is all 'a's, change the last character to 'z'
            char[] chars = s.toCharArray();
            chars[n - 1] = 'z';
            return String.valueOf(chars);
        }

        char [] chars = s.toCharArray();
        
        while(i<n && chars[i]!='a'){
            chars[i]-=1;
            i++;
        }
        return String.valueOf(chars);
    }
}