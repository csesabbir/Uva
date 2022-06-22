import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			String str = br.readLine();
			int len = str.length();
			boolean []arr = new boolean[len];
			for (int i = 0; i < len; i++) {
				if (str.charAt(i) == 'B') {
					arr[i] = true;
					if (i - 1 >= 0) {
						arr[i - 1] = true;
					}
					if (i - 2 >= 0) {
						arr[i - 2] = true;
					}
				} else if (str.charAt(i) == 'D') {
					arr[i] = true;
				} else if (str.charAt(i) == 'S') {
					arr[i] = true;
					if (i - 1 >= 0) {
						arr[i - 1] = true;
					}
					if (i + 1 < len) {
						arr[i + 1] = true;
					}
				}
			}
			int res = 0;
			for (int i = 0; i < len; i++) {
				if (!arr[i]) {
					++res;
				}
			}
			out.println("Case " + tc + ": " + res);
		}
		out.flush();
	}
}