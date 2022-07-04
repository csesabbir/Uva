import java.io.*;
import java.util.*;

public class Main {
	public static PrintWriter out;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		out = new PrintWriter (System.out);
		int tc = 1;
		while (true) {
			String str = br.readLine();
			if (str.equals("0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer (str, " ", false);
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			out.println("Case " + tc + ":");
				if (sum % n == 0) {
					int res = sum / n;
					if (res < 0) {
						out.println("- " + (Math.abs(sum / n)));
					} else {
						out.println((sum / n));
					}
					
				} else {
					if (n > Math.abs(sum)) {
						String res = solve1(sum, n);
						out.println(res);
					} else {
						String res = solve(sum, n);
						out.println(res);
					}
				}
			tc++;
		}
		out.flush();
	}
	private static String solve1(int sum, int n) {
		boolean flag = (sum > 0);
		sum = (int)Math.abs(sum);
		String res = "";
		int r = sum % n;
		int g = gcd(r, n);
		r /= g;
		n /= g;
		int len1 = Integer.toString(n).length();
		int len2 = Integer.toString(r).length();
		String up = "" + Integer.toString(r);
		for (int i = 0; i < (len1 - len2); i++) {
			up = " " + up;
		}
		String d = "";
		for (int i = 0; i < len1; i++) {
			d += "-";
		}
		if (!flag) {
			res = "  "+ up + "\n" + "- " + d + "\n" + "  " + Integer.toString(n);
		} else {
			res = up + "\n" + d + "\n" + Integer.toString(n);
		}
		return res;
	}
	private static String solve(int sum, int n) {
		String rrr = "";
		boolean flag = (sum > 0);
		sum = (int)Math.abs(sum);
		int r = sum % n;
		int res = sum / n;
		int g = gcd(n, r);
		n /= g;
		r /= g;
		int len1 = Integer.toString(n).length();
		int len2 = Integer.toString(r).length();
		String r1 = Integer.toString(r);
		for (int i = 0; i < ((Integer.toString(res).length()) + (len1 - len2)); i++) {
			r1 = " " + r1;
		}
		String dd = "";
		for (int i = 0; i < len1; i++) {
			dd += "-";
		}
		String down = Integer.toString(n);
		for (int i = 0; i < Integer.toString(res).length(); i++) {
			down = " " + down;
		}
		if (!flag) {
			rrr = "  " + r1 + "\n" + "- " + Integer.toString(res) + dd + "\n" + "  " + down;
		} else {
			rrr = r1 + "\n" + Integer.toString(res) + dd + "\n" + down;
		}
		return rrr;
	}
	private static int gcd (int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}