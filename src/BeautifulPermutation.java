import java.util.*;
import java.io.*;

public class BeautifulPermutation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 2 || n == 3) {
            out.println("NO SOLUTION");
            out.flush();
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i += 2) {
            sb.append(i).append(' ');
        }
        for (int i = 1; i <= n; i += 2) {
            sb.append(i).append(' ');
        }

        out.println(sb.toString().trim());
        out.flush();
    }
}