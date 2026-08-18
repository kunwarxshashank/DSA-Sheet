import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class RPG {
    public static void main(String [] args){
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        int[] monster = new int[n];
        int[] bonus = new int[n];

        for(int i=0; i<n; i++) monster[i] = s.nextInt();
        for(int i=0; i<n; i++) bonus[i] = s.nextInt();


        // we can defeat monsters in any order so we need to sort it using comparator
        class Monster{
            int power;
            int bonus;

            Monster(int power, int bonus){
                this.power = power;
                this.bonus = bonus;
            }
        }
        
        // creating array of objects
        Monster[] monsters = new Monster[n];
        for(int i=0; i<n; i++){
            monsters[i] = new Monster(monster[i], bonus[i]);
        }

        // sort array using comparator
        Arrays.sort(monsters, (a, b) -> Integer.compare(a.power, b.power)); 
        // or Arrays.sort(monsters, Comparator.comparingInt(m -> m.power));
        // or Arrays.sort(monsters, (a, b) -> a.power - b.power);
        

        int count = 0;
        for(Monster m: monsters){
            if(e<m.power)
                break;
            e += m.bonus;
            count++;
        }

        System.out.println(count);


    }
}
