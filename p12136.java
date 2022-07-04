import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			StringTokenizer st = new StringTokenizer (str1, " ", false);
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			int min1 = minConvert(s1); 
			int min2 = minConvert(s2);
			st = new StringTokenizer (str2, " ", false);
			s1 = st.nextToken();
			s2 = st.nextToken();
			int min3 = minConvert(s1); 
			int min4 = minConvert(s2);	
			boolean []arr = new boolean[(24 * 60) + 1];
			for (int i = min1; i <= min2; i++) {
				arr[i] = true;
			}
			boolean flag = true;
			for (int i = min3; i <= min4; i++) {
				if (!arr[i]) {
					arr[i] = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				out.println("Case " + tc + ": " + "Hits Meeting");
			} else {
				out.println("Case " + tc + ": " + "Mrs Meeting");
			}
		}
		out.flush();
	}
	private static int minConvert(String time) {
		int min = 0;
		StringTokenizer st1 = new StringTokenizer (time, ":", false);
		int h = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		min = ((h * 60) + m);
		return min;
	}
}