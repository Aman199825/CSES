import java.util.*;
import java.io.*;

public class Repetitions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String s = br.readLine().trim();
        out.println(solve(s));
        out.flush();
    }

    static int solve(String s) {
        int res = 0;
        int currCount = 0;
        Character prev = null;
        for (char ch : s.toCharArray()) {
            if (prev != null && ch == prev) {
                currCount += 1;
            } else {
                res = Math.max(res, currCount);
                prev = ch;
                currCount = 1;
            }
        }
        res = Math.max(res, currCount);
        return res;
    }
}