import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter (System.out);
        while (in.hasNext()) {
            int n = in.nextInt();
            int [][]arr = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int value = in.nextInt();
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j] - arr[i - 1][j - 1] + value;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = i; k <= n; k++) {
                        for (int l = j; l <= n; l++) {
                            int sub = arr[k][l];
                            sub -= arr[i - 1][l];
                            sub -= arr[k][j - 1];
                            sub += arr[i - 1][j - 1];
                            max = Math.max(sub, max);
                        }
                    }
                }
            }
            out.println(max);
        }
        out.flush();
    }
}