import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter (System.out);
		int test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			int len = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int []arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			boolean flag = false;
			if (len == 0) {
				flag = true;
			} else {
				for (int mask = 0; mask < (1 << n); mask++) {
					int sum = 0;
					for (int i = 0; i < n; i++) {
						if ((mask & (1 << i)) > 0) {
							sum += arr[i];
						}
					}
					if (sum == len) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		out.flush();
	}
}