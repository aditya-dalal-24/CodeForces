package contest;
import java.util.*;
public class samediff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            char l=s.charAt(n-1);
            int op = 0;
            for (int i=0;i<n-1;i++) {
                if (s.charAt(i)!=l) {
                    op++;
                }}
            System.out.println(op);
        }}}