/*--------------CONSTRUCTOR----------------

0. Special type of function
1. Constructer used to initialize object
2. Don't have any return type
3. Have same name as class name
4. Constructor can be overloaded (Multiple constructors ho skte hai)
5. Constructor can't be private

*/

 
class Cricket{
    String player;
    int run;
    int wicket;

    // Creating a default constructor
    Cricket(){
        System.out.println("Hello Default Constructor");
    }

    
    // Parameterized constructor
    Cricket(String player1, int run1, int wicket1){
        player = player1;
        run = run1;
        wicket = wicket1;
        System.out.println("Player1: "+player);
    }


    // Copy Constructor
    Cricket(Cricket c){
        player = c.player;
        run = c.run;
        wicket = c.wicket;
        System.out.println("Player2: "+player);
    }


}


public class Constructor {
    public static void main(String[] args) {
        Cricket cric = new Cricket(); //  Default Constructor
        Cricket cric2 = new Cricket("prateek" , 100 , 5); // Parametric Constructor
        Cricket cric3 = new Cricket(cric2);  // Copy Constructor
    }
}