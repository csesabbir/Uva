import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);	
		int test = Integer.parseInt (br.readLine());
		for (int tc = 1; tc <= test; tc++) {
			StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			TreeMap<Integer, Integer> map1 = new TreeMap<>();
			TreeMap<Integer, Integer> map2 = new TreeMap<>();
			st = new StringTokenizer (br.readLine(), " ", false);
			while (st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				if (map1.containsKey(value)) {
					map1.put(value, map1.get(value) + 1);
				} else {
					map1.put(value, 1);
				}
			}
			st = new StringTokenizer (br.readLine(), " ", false);
			while (st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				if (map2.containsKey(value)) {
					map2.put(value, map2.get(value) + 1);
				} else {
					map2.put(value, 1);
				}
			}
			int res = 0;
			for (int k : map1.keySet()) {
				if (map2.containsKey(k)) {
					res += Math.abs(map1.get(k) - map2.get(k));
				} else {
					res += map1.get(k);
				}
			}
			for (int k : map2.keySet()) {
				if(!map1.containsKey(k)) {
					res += map2.get(k);
				}
			}
			out.println(res);
		}
		out.flush();
	}
}