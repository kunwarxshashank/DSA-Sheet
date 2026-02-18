public class Local {

    public void test(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args){
        Local local = new Local();
        local.test();
    }
    
}