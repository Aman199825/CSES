import java.util.*;
import java.io.*;

public class EqualDivision {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine().trim());
        long total = n * (n + 1) / 2;

        if (total % 2 != 0) {
            out.println("NO");
            out.flush();
            return;
        }

        long target = total / 2;
        List<Long> setA = new ArrayList<>();
        List<Long> setB = new ArrayList<>();

        long remaining = target;
        for (long i = n; i >= 1; i--) {
            if (i <= remaining) {
                setA.add(i);
                remaining -= i;
            } else {
                setB.add(i);
            }
        }

        out.println("YES");
        out.println(setA.size());
        StringBuilder sa = new StringBuilder();
        for (long x : setA) sa.append(x).append(' ');
        out.println(sa.toString().trim());

        out.println(setB.size());
        StringBuilder sb = new StringBuilder();
        for (long x : setB) sb.append(x).append(' ');
        out.println(sb.toString().trim());

        out.flush();
    }
}