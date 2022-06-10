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
    	public int n;
    	public int []bit;
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int tc = 1;
            boolean flag = false;
            while (true) {
            	n = in.nextInt();
            	if (n == 0) {
            		break;
            	}
            	if (flag) {
            		out.println();
            	}
            	flag = false;
            	bit = new int[n + 1];
            	for (int i = 1; i <= n; i++) {
            		int value = in.nextInt();
            		update(i, value);
            	}
            	out.println("Case "+ tc +":");
            	tc++;

            	while (true) {
            		String str = in.next();
            		if (str.equals("END")) {
            			break;
            		} else if (str.equals("M")) {
            			int a = in.nextInt();
            			int b = in.nextInt();
            			int res = sum(b) - sum(a - 1);
            			out.println(res);
            		} else {
            			int pos = in.nextInt();
            			int value = in.nextInt();
            			update(pos, value - (sum(pos) - sum(pos - 1)));
            		}
            	}
            	flag = true;	
            }
        }
        public void update (int i, int value) {
        	while (i <= n) {
        		bit[i] += value;
        		i += (i & -i);
        	}
        } 
        public int sum(int i) {
        	int value = 0;
        	while (i > 0) {
        		value += bit[i];
        		i -= (i & -i);
        	}
        	return value;
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

