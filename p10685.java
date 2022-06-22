import java.io.*;
import java.util.*;

public class Main {
	public static int []parent;
	public static int []rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		while (true) {
			String str = br.readLine();
			if (str.equals("0 0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer (str, " ", false);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			Map<String, Integer> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				str = br.readLine();
				map.put(str, i);
			}
			int max = 1;
			parent = new int[n + 1];
			rank = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				parent[i] = i;
				rank[i] = 1;
			}
			for (int i = 1; i <= m; i++) {
				st = new StringTokenizer (br.readLine(), " ", false);
				int a = map.get(st.nextToken());
				int b = map.get(st.nextToken());
				max = Math.max(max, union(a, b));
			}
			out.println(max);
			str = br.readLine();
		}
		out.flush();	
	}
	private static int find(int x) {
		if (parent[x] == x) {
			return parent[x];
		} else {
			return parent[x] = find(parent[x]);
		}
	}
	private static int union(int x, int y) {
		int x_set = find(x);
		int y_set = find(y);
		if (x_set != y_set) {
			if (rank[x_set] >= rank[y_set]) {
				rank[x_set] += rank[y_set];
				parent[y_set] = x_set;
				return rank[x_set];
			} else {
				rank[y_set] += rank[x_set];
				parent[x_set] = y_set;
				return rank[y_set]; 
			}
		} else {
			return rank[x_set];
		}
	}
}