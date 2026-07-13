import java.util.Stack;

class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{][]()";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        if(s.length()==0){
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // opening should be inserted in stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                // agar closing bracket hai
                // to hume ye check karna hai, us stack me is bracket ka opening bracket hai ki
                // nahi
                // agar nahi hai to maltv false

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if (ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
                    stack.pop();
                } else {
                    return false;
                }

            }

        }

            return true;
    }
}