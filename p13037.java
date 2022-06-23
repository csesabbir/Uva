import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
			HashSet<Integer> s1 = new HashSet<>();
			HashSet<Integer> s2 = new HashSet<>();
			HashSet<Integer> s3 = new HashSet<>();
				st = new StringTokenizer (br.readLine(), " ", false);
				while (st.hasMoreTokens()) {
					s1.add(Integer.parseInt(st.nextToken()));
				}
				st = new StringTokenizer(br.readLine(), " ", false);
				while (st.hasMoreTokens()) {
					s2.add(Integer.parseInt(st.nextToken()));
				}
				st = new StringTokenizer (br.readLine(), " ", false);
				while (st.hasMoreTokens()) {
					s3.add(Integer.parseInt(st.nextToken()));
				}
				int []arr1 = solve(s1, s2, s3);
				int []arr2 = solve(s2, s1, s3);
				int []arr3 = solve(s3, s1, s2);
				out.println("Case #" + tc + ":");
				out.println(arr1[0] + " " + arr1[1]);
				out.println(arr2[0] + " " + arr2[1]);
				out.println(arr3[0] + " " + arr3[1]);
		}
		out.flush();
	}
	private static int[] solve(HashSet<Integer> s1, HashSet<Integer> s2, HashSet<Integer> s3) {
		int v1 = 0, v2 = 0;
		for (int i : s1) {
			if (!s2.contains(i) && !s3.contains(i)) {
				v1++;
			}
		}
		for (int i : s2) {
			if (!s1.contains(i) && s3.contains(i)) {
				v2++;
			}
		}
		return new int[] {v1, v2};
	}
}