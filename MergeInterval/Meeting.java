import java.util.*;

public class Meeting {
    public static int meetingRoom(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;

        int count = 0;
        int maxCount = 0;

        while (i < start.length) {

            if (start[i] < end[j]) {
                count++;                        // Allocate a room
                maxCount = Math.max(maxCount, count);
                System.out.println("Count "+i+ " start: "+start[i]+" end: "+end[i]);
                i++;
            } else {
                count--;                        // Free a room
                j++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int start[] = { 2,6,9 };
        int end[] = { 4, 10, 12 };

        int result = meetingRoom(start, end);
        System.out.println(result);

    }
}
