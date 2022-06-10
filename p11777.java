import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
			int sum = 0;
			sum += Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			int []arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			sum += (arr[1] + arr[2]) / 2;
			out.print("Case " + tc + ": ");
			if (sum >= 90) {
				out.println("A");
			} else if (sum >= 80 && sum < 90) {
				out.println("B");
			} else if (sum >= 70 && sum < 80) {
				out.println("C");
			} else if (sum >= 60 && sum < 70) {
				out.println("D");
			} else {
				out.println("F");
			}
		}
		out.flush();
	}
}