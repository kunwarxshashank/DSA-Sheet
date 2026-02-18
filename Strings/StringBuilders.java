public class StringBuilders {

    // Here StringBuilder is Mutable
    // Mutable means you can change their content without creating new object
    // eg. String s = "hello"; 
    //     s = s+" world"; 
    // here hello is not modified but new object is created new memory allocate hoga
    // there String is immutable, to solve it we use StringBuilder



    public static void main(String[] args) {

        // 1. append()

        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb); // output => hello world

        // 2. insert()
        StringBuilder sb1 = new StringBuilder("Python"); 
        sb1.insert(2, "est");
        System.out.println(sb1); // output => Pyestthon

        // 3. delete() 
        sb1.delete(2, 5);
        System.out.println(sb1); // output => Python

        // 4. replace()
        sb1.replace(0,6,"Java");
        System.out.println(sb1); // output => Java

        // 5. reverse()
        sb1.reverse();
        System.out.println(sb1);
    }
}
