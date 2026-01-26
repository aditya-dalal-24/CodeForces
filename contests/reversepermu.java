package contest;
import java.util.Scanner;
public class reversepermu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
            int[] sMax = new int[n];
            sMax[n-1] = p[n - 1];
            for (int i = n - 2; i >= 0; i--)
                sMax[i] = Math.max(sMax[i + 1], p[i]);
            int l = -1, r = -1;
            for (int i = 0; i < n; i++) {
                if (p[i] != sMax[i]) {
                    l=i;
                    for (int j = i + 1; j < n; j++) {
                        if (p[j] == sMax[i]) {
                            r = j;
                            break;
                        }}
                    break;
                }}
            if (l!=-1){
                while (l<r) {
                    int temp = p[l];
                    p[l] = p[r];
                    p[r] = temp;
                    l++;
                    r--;
                }}
            for (int x : p)
                System.out.print(x + " ");
            System.out.println();
        }}}