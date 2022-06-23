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
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
            for (int i = 1; i <= m; i++) {
                st = new StringTokenizer (br.readLine(), " ", false);
                int k = Integer.parseInt(st.nextToken());
                int []arr = new int[k];
                int j = 0;
                arr[j] = Integer.parseInt(st.nextToken());
                while (st.hasMoreTokens()) {
                    j++;
                    arr[j] = Integer.parseInt(st.nextToken());
                    int x = arr[j];
                    int y = arr[j - 1];
                    union(x, y);
                }
            }
            int p = find(0);
            out.println(rank[p]);
        }
        out.flush();
    }
    private static void union(int x, int y) {
        int x_set = find(x);
        int y_set = find(y);
        if (x_set != y_set) {
            if (rank[x_set] >= rank[y_set]) {
                rank[x_set] += rank[y_set];
                parent[y_set] = x_set;
            } else {
                rank[y_set] += rank[x_set];
                parent[x_set] = y_set;
            }
        }
    }
    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return parent[x] = find(parent[x]); 
        }
    }
}