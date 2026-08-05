import java.util.*;

class Pair{
    int first;
    String second;

    Pair(int first, String second){
        this.first = first;
        this.second = second;
    }
}


public class ListOnPairs {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair(1, "Aman"));
        list.add(new Pair(2, "Boby"));
        list.add(new Pair(2, "Cuties"));

        for(Pair p: list){
            System.out.print(" [ "+p.first+","+p.second+"]");
        }
        
    }
}
