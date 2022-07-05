import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            while (true) {
                int n = in.nextInt();
                if (n == 0) {
                    break;
                }
                String str = in.next();
                int min = Integer.MAX_VALUE;
                int pos1 = -1, pos2 = -1;
                for (int i = 0; i <  n; i++) {
                    if (str.charAt(i) == 'R') {
                        pos1 = i;
                        if (pos2 >= 0) {
                            min = Math.min(min, Math.abs(pos2 - pos1));
                        }
                    } else if (str.charAt(i) == 'D') {
                        pos2 = i;
                        if (pos1 >= 0) {
                            min = Math.min(min, Math.abs(pos2 - pos1));
                        }
                    } else if (str.charAt(i) == 'Z') {
                        min = Math.min(0, min);
                        break;
                    }
                }
                out.println(min);
            } 
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
