import java.util.Vector;
public class Vectors{
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();

        // Note ek vector me directly ek hi datatype ja skta hai
        v.add("h");
        v.add("h");
        v.add("h");
        v.add("h");
        System.out.println(v);


        // used to creat 2d vector
        Vector<Vector<Integer>> v1 = new Vector<>();

        // vector of pairs/tuples
        // A custom class to hold the pair
        class StringList{
             Vector<Integer> name;
            Vector<Integer> numbers;
        }

        Vector<StringList> v2 = new Vector<>();

    }
}