import java.util.*;
import java.io.*;

public class BitStrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * 2) % MOD;
        }
        out.println(result);
        out.flush();
    }
}