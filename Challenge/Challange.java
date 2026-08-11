import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challange {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(reader.readLine().trim());

        for (int t = 0; t < n; t++) {
            int x = Integer.parseInt(reader.readLine().trim());

            String line = reader.readLine();
            String[] tokens;
            if (line == null || line.trim().isEmpty()) {
                tokens = new String[0];
            } else {
                tokens = line.trim().split("\\s+");
            }

            if (tokens.length != x) {
                output.append(-1).append('\n');
                continue;
            }

            long sum = 0;
            for (String token : tokens) {
                int y = Integer.parseInt(token);
                if (y <= 0) {
                    long sq = (long) y * y;
                    sum += sq * sq;
                }
            }

            output.append(sum).append('\n');
        }

        System.out.print(output);
    }
}
