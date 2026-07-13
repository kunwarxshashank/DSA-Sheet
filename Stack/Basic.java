import java.util.Stack;
public class Basic{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "hello";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }

        while(!stack.isEmpty()){
           char ch = stack.pop();
           sb.append(ch);
        }
        System.out.println(sb);
    }
}