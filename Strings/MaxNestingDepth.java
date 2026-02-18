public class MaxNestingDepth {
    public static int checkDepth(String s) {

        int depth = 0;
        int maxdepth = 0;
        
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                depth++;
                maxdepth = Math.max(maxdepth, depth);
            } else if (ch == ')') {
                depth--;
            }

        }

        return maxdepth;
    }

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int result = checkDepth(s);
        System.out.println(result);
    }
}
