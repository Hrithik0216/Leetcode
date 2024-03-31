import java.util.*;
//Comparator Interface is used. It has 2 methods, 1.compareTo 2.equals.
//The default Arrays.sort uses the mergeSort inside
class Solution {
    public String largestNumber(int[] nums) {
        String [] s = new String[nums.length];
        for(int i=0; i< nums.length; i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length;i++){
            sb.append(s[i]);
        }
        String result = sb.toString();
        return result.startsWith("0")?"0": result;
    }
}