class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int k = Math.min(n, m);

        for (int i = 0; i < k; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append the remaining characters from the longer string
        sb.append(word1.substring(k));
        sb.append(word2.substring(k));

        return sb.toString();
    }
}
