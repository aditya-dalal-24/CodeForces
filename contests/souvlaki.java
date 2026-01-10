package contest;
import java.util.*;
public class souvlaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc); }}
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        boolean canWin = true;
        for (int i=1; i<n-1; i+=2) {
            if (s[i]!=s[i+1]) {
                canWin=false;
                break; }}
        System.out.println(canWin ? "YES" : "NO");
    }}