package contest;
import java.util.Scanner;
public class hourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long s=sc.nextLong();
            long k=sc.nextLong();
            long m=sc.nextLong();
            long top=s;
            long b=0;
            long f=m/k;
            long r=m%k;
            for (int i = 0; i < Math.min(f, 2); i++) {
                long g  = Math.min(top, k);
                top -= g;
                b += g;
                // Flip
                long tmp = top;
                top = b;
                b = tmp;
            }
            if(f>2){
                if(f%2!=0){
                    long g=Math.min(top, k);
                    top -= g;
                    b += g;
                    long tmp = top;
                    top = b;
                    b = tmp;
                }
            }
            top-=Math.min(top, r);
            System.out.println(top);

    }}}