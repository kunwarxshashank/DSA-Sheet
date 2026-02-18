public class ReverseWordsInString {
    public static String Reverse(String s) {
        StringBuilder sb = new StringBuilder();

        // String[] words = str.split(" ");
        // handle multiple strings safely
        // here regex \s+ denotes all space sequence + denotes more than one

        String[] words = s.trim().split("\\s+");


        for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]).append(" ");
        }


        // here we can convert it to strings and trim
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "  hello world  ";
        String result = Reverse(str);
        System.out.println(result);
        System.out.println(result.length());
    }
}
