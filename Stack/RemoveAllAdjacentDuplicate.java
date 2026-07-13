import java.util.ArrayDeque;
import java.util.Stack;

/*
public class RemoveAllAdjacentDuplicate {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int count = 1;
        int newcount = 1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (newcount != count)
                count = 1;
                newcount = 1;

            if (!stack.isEmpty() && ch == stack.peek()) {
                count++;
                newcount++;
            }else{
                count = 1;
                newcount =1;
            }

            stack.push(ch);

            while (!stack.isEmpty() && ch == stack.peek() && count == k) {
                stack.pop();
                newcount--;
            }
        }

        System.out.println(stack);
    }
}

 */

public class RemoveAllAdjacentDuplicate {

    public static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args) {

        String s = "deeedbbcccbdaa";
        int k = 3;

        Stack<Pair> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // agar top new element ke barabar rha to count ++
            if (!stack.isEmpty() && stack.peek().ch == ch) {

                // increment top count e.g (a,1) => (a,2)
                stack.peek().count++;

                // agar k time count hogya
                if (stack.peek().count == k) {
                    // remove the char
                    stack.pop();
                }
            } else {
                // agar next character top ke equal nahi hai to use add kro uska count ek hona chaiye
                stack.push(new Pair(ch, 1));
            }
        }

        // ab stack me remaining character aur uske count hai
        while (!stack.isEmpty()) {
            // remaining stack me se jo pair hai use pop kro, aur uska character stack me add kro
            Pair p = stack.pop(); // e.g (a,2)
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }

        System.out.println(sb.toString());    
    }

    
}
