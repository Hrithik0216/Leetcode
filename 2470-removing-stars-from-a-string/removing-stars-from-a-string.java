class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "";  // Return an empty string if the stack is empty
        }

        // Change the loop condition to while (!stack.isEmpty())
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString();
    }
}
