class Game{
    void Play(){
        System.out.println("Playing a game");
    }
}

class Cricket extends Game{
    void Play(){
        System.out.println("Cricket");
    }

    
}

class Football extends Game{
    void Play(){
        System.out.println("Footabl");
    }
}

class Chess extends Game{
    void Play(){
        System.out.println("Chess");
    }
}

public class Poly3 {
    public static void main(String[] args) {
        Game g1 = new Game();
        Cricket c1 = new Cricket();
        Football f1 =  new Football();
        Chess ch1 = new Chess();

        Object arr[] = {g1, c1, f1, ch1};
        for(int i=0; i<4; i++){
            arr.Play();
        }
    }
}
