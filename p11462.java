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
import java.util.ArrayList;


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
                int max = 0;
                int []arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                    max = Math.max(arr[i], max);
                }
                int []count = new int[max + 1];
                for (int i = 0; i < n; i++) {
                    count[arr[i]]++;
                }
                ArrayList<Integer> res = new ArrayList<>();
                for (int i = 0; i <= max; i++) {
                    for (int j = 1; j <= count[i]; j++) {
                        res.add(i);
                    }
                }
                for (int i = 0; i < n - 1; i++) {
                    out.print(res.get(i) + " ");
                }
                out.println(res.get(n - 1));
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

