/*
import java.util.Scanner;
class Prateek {
    int age; // JO method ke bahar aur class ke andar ho use instance variable khte hai ...
    String name;

    void PrintSomething() {
        System.out.println("My name " + name + " age: " + age);
    }
}

class InstaProfile {
    String username;
    int followers;

    void IncreaseFollowers() {
        followers++;
        System.out.println("Your followers is increased: " + followers);
    }
}

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        
    InstaProfile insta = new InstaProfile();

    System.out.print("Enter Your Username: ");
    insta.username = scan.nextLine();
    System.out.println("Your username is: "+insta.username);

    System.out.println("1 followers increased");
    
    insta.IncreaseFollowers();
    }
}

*/

/* 
NOTE: Static function is liye banate hai jisse,
bina object banae function ko call kar ske
*/

class Youtube {
    int videos;
    int subscriber;

    public int increaseVideos(int v){
        videos++;
        System.out.println(videos);
        return 0;

    }
}

class Main{
    public static void main(String[] args) {
        Youtube yt = new Youtube();
        int x = 10;
        x = yt.increaseVideos(x);
    }
}

