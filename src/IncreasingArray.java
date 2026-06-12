import java.util.*;
import java.io.*;

public class IncreasingArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static int nextInt() throws IOException { return Integer.parseInt(next()); }
    static long nextLong() throws IOException { return Long.parseLong(next()); }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = nextLong();

        long moves = 0;
        // TODO: solve here
        Long prev=null;
        for(long ele: arr) {
            if(prev==null) {
                prev=ele;
            } else {
                if(ele<prev) {
                    moves+=prev-ele;
                }
                prev=Math.max(prev,ele);
            }
        }

        out.println(moves);
        out.flush();
    }
}