package contest;
import java.util.Scanner;
public class YKminabssum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if(a[0] != -1 && a[n-1] != -1){
            }
            else if(a[0]!=-1 && a[n-1]==-1){
                a[n-1]=a[0];
            } else if (a[0]==-1 && a[n-1]!=-1) {
                a[0]=a[n-1];
            } else{
                a[0]=0;
                a[n-1]=0; }
            for(int i = 0; i < n; i++) {
                if (a[i] == -1) a[i] = 0;
            }
            int diff = Math.abs(a[n-1]-a[0]);
            System.out.println(diff);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            }}}