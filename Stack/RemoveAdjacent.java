import java.util.Stack;

class RemoveAdjacent{
    public static void main(String[] args) {
        String s = "azxxzy";

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() ==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        // for (Character ch : stack) {
        //     sb.append(ch);
        // }

        // or we can pop element
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse().toString());


    }
}