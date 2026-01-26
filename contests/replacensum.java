package contest;
import java.util.Scanner;
public class replacensum {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt(),q=sc.nextInt();
                int[] a=new int[n],b=new int[n];
                for(int i=0;i<n;i++)a[i]=sc.nextInt();
                for(int i=0;i<n;i++)b[i]=sc.nextInt();
                int[] suf=new int[n];
                suf[n-1]=Math.max(a[n-1],b[n-1]);
                for(int i=n-2;i>=0;i--)suf[i]=Math.max(suf[i+1],Math.max(a[i],b[i]));
                long[] pre=new long[n+1];
                for(int i=0;i<n;i++)pre[i+1]=pre[i]+suf[i];
                StringBuilder sb=new StringBuilder();
                while(q-->0){
                    int l=sc.nextInt(),r=sc.nextInt();
                    sb.append(pre[r]-pre[l-1]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }}}
