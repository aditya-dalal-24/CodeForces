package eight;
import java.util.*;
public class dontbedistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ok = true;
            Set<Character> seen = new HashSet<>();
            char prev = s.charAt(0);
            seen.add(prev);
            for (int i = 1; i < n; i++) {
                char c = s.charAt(i);
                if (c != prev) {
                    if (seen.contains(c)) {
                        ok = false;
                        break;}
                    seen.add(c);
                    prev = c;
                }}
            System.out.println(ok ? "YES" : "NO");
                t--;   }}}
