package eight;
import java.util.Scanner;
public class goodarrays {
    static boolean even(int n){
        return n % 2 == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int c=0, i=1, cnt=1;
        while(i<n) {
            if ((even(arr[i])==even(arr[i - 1]))) cnt++;
            else {c+=cnt-1;
            cnt=1; }
            i++;
            }
        c+=cnt-1;
            System.out.println(c);
        }}}

