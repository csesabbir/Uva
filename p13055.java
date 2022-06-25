import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int n = Integer.parseInt(br.readLine());
		Stack<String> stk = new Stack<>();
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
			String str = st.nextToken();
			if (str.equals("Sleep")) {
				String tmp = st.nextToken();
				stk.push(tmp);
			} else if (str.equals("Test")) {
				if (stk.empty()) {
					out.println("Not in a dream");
				} else {
					out.println(stk.peek());
				}
			} else if (str.equals("Kick") && !stk.empty()) {
				stk.pop();
			}
		}
		out.flush();
	}
}