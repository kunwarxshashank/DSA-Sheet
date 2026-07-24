/*
class NumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int a = 0, b = 0, l = 0, o = 0, n = 0;

        for(char c: text.toCharArray()){
            if(c == 'a') a++;
            else if (c == 'b') b++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        return Math.min(Math.min(b,a), Math.min(Math.min(l/2, o/2), n));
    }
}

*/

class NumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int count[] = new int[26];

        for(char c: text.toCharArray()){
            int val = c-'a'; // b - a => 
            count[val]++;
        }


        return Math.min(
            Math.min(count['b' - 'a'], count['a' - 'a']),
            Math.min(count['l' - 'a'] / 2,
            Math.min(count['o' - 'a'] / 2, count['n' - 'a']))
        );
    }
}