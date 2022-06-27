/* Lotto */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		StringTokenizer st = new StringTokenizer (br.readLine(), " ", false);
		int n = Integer.parseInt(st.nextToken());
		while (true) {
			if (n == 0) {
				break;
			}
			int i = 0;
			int []arr = new int[n];
			while (st.hasMoreTokens()) {
				arr[i++] = Integer.parseInt(st.nextToken());
			}
			for (i = 0; i < n; i++) {
				for (int i1 = i + 1; i1 < n; i1++) {
					for (int i2 = i1 + 1; i2 < n; i2++) {
						for (int i3 = i2 + 1; i3 < n; i3++) {
							for (int i4 = i3 + 1; i4 < n; i4++) {
								for (int i5 = i4 + 1; i5 < n; i5++) {
									out.print (arr[i] + " " + arr[i1] + " " + arr[i2] + " " + arr[i3] + " " + arr[i4]);
									out.println( " " + arr[i5]);
								}
							}
						}
					}
				}
			}
			st = new StringTokenizer (br.readLine(), " ", false);
			n = Integer.parseInt(st.nextToken());
			if (n > 0) {
				out.println();
			}
		}
		out.flush();
	}
}