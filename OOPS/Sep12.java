class Student{
    String name = "amit";
    private String getName(){
        return  name;
    }
}
public class Sep12{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
    }
}