public class PassByValue{
    public static void main(String[] args) {
    int number = 10;
    modifyPrimitive(number);
    System.out.println(number); // Prints 10 (unchanged)
}

public static void modifyPrimitive(int num) {
    num = 50; // Only changes the copy inside this method
}

}