package eight;
import java.util.Scanner;
public class stonegame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            int max=arr[0];
            int min=arr[0];
            int mxi=0;
            int mni=0;
            for (int i=1;i<n;i++) {
                if (arr[i]>max) {
                    max=arr[i];
                    mxi=i;
                }
                if (arr[i]<min) {
                    min=arr[i];
                    mni=i;
                }}
            int a=Math.max(mxi, mni)+1;
            int b=Math.max(n-mxi, n-mni);
            int c=Math.min(mni+1+(n-mxi), mxi+1+(n-mni));
            int d=Math.min(a, Math.min(b,c));
            System.out.println(d);
            }}}