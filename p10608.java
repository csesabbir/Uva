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
    	public int []parent;
        public int []rank;
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	int test = in.nextInt();
        	for (int tc = 1; tc <= test; tc++) {
        		int n = in.nextInt(), m = in.nextInt();
        		parent = new int[n + 1];
        		rank = new int[n + 1];
        		for (int i = 1; i <= n; i++) {
        			parent[i] = i;
        			rank[i] = 1;
        		}
        		int max = 1;
        		for (int i = 1; i <= m; i++) {
        			int a = in.nextInt(), b = in.nextInt();
        			max = Math.max(union(a, b), max);
        		}
        		out.println(max);
        	} 
        }
        public int find(int x) {
        	if (parent[x] == x) {
        		return x;
        	} else {
        		return parent[x] = find(parent[x]);
        	}
        }
        public int union(int x, int y) {
        	int x_set = find(x);
        	int y_set = find(y);
        	if (x_set != y_set) {
        		if (rank[x_set] > rank[y_set]) {
        			parent[y_set] = x_set;
        			rank[x_set] += rank[y_set];
        			return rank[x_set];
        		} else {
        			parent[x_set] = y_set;
        			rank[y_set] += rank[x_set];
        			return rank[y_set];
        		}
        	} else {	
        		return rank[x_set];
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

