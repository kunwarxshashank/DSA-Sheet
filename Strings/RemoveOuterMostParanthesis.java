public class RemoveOuterMostParanthesis {

    public static StringBuilder removeParanthesis(String str) {

        // step1: initialize result string
        StringBuilder sb = new StringBuilder();

        // Step2: create level 
        int level = 0;

        // step3: traverse the string

        // step4: skiping first level paranethesis
        // insert if level>0 

        // step5:  
        
        for(char ch: str.toCharArray()){
            if(ch=='('){
                if(level>0) sb.append(ch);
                level++;
            }
            else if(ch==')'){
                level--;
                if(level>0) sb.append(ch);
            }
        }

        return sb;

    }

    public static void main(String[] args) {
        String str =  "()(()())(())";
        StringBuilder result = removeParanthesis(str);
        System.out.println(result);

    }
}
