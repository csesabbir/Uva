import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			int []pole = new int[n + 1];
			Pair []arr = new Pair[n + 1];
			for (int i = 1; i <= n; i++) {
				StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
				int id = Integer.parseInt(st.nextToken());
				int idx = Integer.parseInt(st.nextToken());
				arr[i] = new Pair(id, idx);
			}
			boolean flag = true;
			for (int i = 1; i <= n; i++) {
				Pair p = arr[i];
				int getId = p.id;
				if (p.idx == 0) {
					if (pole[i] > 0) {
						flag = false;
						break;
					} else {
						pole[i] = getId;
					}
				} else if (p.idx > 0) {
					if (i + p.idx <= n && pole[i + p.idx] == 0) {
						pole[i + p.idx] = getId;
					} else {
						flag = false;
						break;
					}
				} else {
					int idx = Math.abs(p.idx);
					if ((i - idx >= 1 && i - idx <= n) && pole[i - idx] == 0) {
						pole[i - idx] = getId;
					} else {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				for (int i = 1; i <= n- 1; i++) {
					out.print(pole[i] + " ");
				}
				out.println(pole[n]);
			} else {
				out.println("-1");
			}
		}
		out.flush();
	}
	static class Pair {
		public int id;
		public int idx;
		public Pair(int id, int idx) {
			this.id = id;
			this.idx = idx;
		}
	}
}