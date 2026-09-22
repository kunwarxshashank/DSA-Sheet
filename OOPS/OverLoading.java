class Test{

    void show(long x){
        System.out.println("long....");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Test t = new Test();

        t.show(10.0);

    }
}
