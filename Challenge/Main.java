import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(reader.readLine().trim());
        StringBuilder result = new StringBuilder();

        // We hold everything back and print once at the end, as required.
        for (int i = 0; i < testCases; i++) {
            int expectedCount = Integer.parseInt(reader.readLine().trim());
            StringTokenizer numbers = new StringTokenizer(reader.readLine());

            // If the count promised on the first line doesn't match what we got, give up on this case.
            if (numbers.countTokens() != expectedCount) {
                result.append(-1).append('\n');
                continue;
            }

            result.append(sumOfFourthPowers(numbers)).append('\n');
        }

        System.out.print(result);
    }

    // Adds up y^4 for every non-positive value, skipping the positives.
    private static long sumOfFourthPowers(StringTokenizer numbers) {
        long sum = 0;

        while (numbers.hasMoreTokens()) {
            long y = Long.parseLong(numbers.nextToken());
            if (y <= 0) {
                sum += y * y * y * y;
            }
        }

        return sum;
    }
}
