package contest;
import java.io.*;
import java.util.*;
public class hugepile{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if (k > n) {
                out.append("-1\n");
                continue;
            }
            long ans = -1;
            for (int i = 0; i <= 60; i++) {
                long p = 1L << i;
                if (p > n) break;
                long low = n / p;
                long high = (n + p - 1) / p;
                if (low <= k && k <= high) {
                    ans = i;
                    break;
                }}
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }}