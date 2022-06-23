import java.io.*;
import java.util.*;

public class Main {
	public static HashSet<Long> hs = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		solve();
		for (;;) {
			long len = Long.parseLong(br.readLine());
			if (len == 0L) {
				break;
			} 
			if(hs.contains(len)) {
				out.println("Special");
			} else {
				out.println("Ordinary");
			}
		}
		out.flush();
	}
	private static void solve() {
		hs.add(1L);
		hs.add(64L);
		hs.add(729L);
		hs.add(4096L);
		hs.add(15625L);
		hs.add(46656L);
		hs.add(117649L);
		hs.add(262144L);
		hs.add(531441L);
		hs.add(1000000L);
		hs.add(1771561L);
		hs.add(2985984L);
		hs.add(4826809L);
		hs.add(7529536L);
		hs.add(11390625L);
		hs.add(16777216L);
		hs.add(24137569L);
		hs.add(34012224L);
		hs.add(47045881L);
		hs.add(64000000L);
		hs.add(85766121L);
	}
}