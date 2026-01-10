package contest;
import java.util.*;

public class sleeping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int blockedUntil = 0;
            int sleep = 0;

            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);

                if (i <= blockedUntil) {
                    continue; // forced awake
                }

                if (c == '1') {
                    blockedUntil = i + k; // awake chain
                } else {
                    sleep++; // allowed to sleep
                }
            }

            System.out.println(sleep);
        }
    }
}
