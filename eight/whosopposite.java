package eight;
import java.util.Scanner;
public class whosopposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int e=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=2*Math.abs(a-b);
            if(a>d || b>d || c>d) {
                System.out.println(-1);
                continue; }
            if(c>d/2) e=c-d/2;
            else e=c+d/2;
            System.out.println(e);
        }
    }
}
