package eight;
import java.util.Scanner;
public class cakelie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long k=sc.nextLong();
            long cost=(n-1)+(m-1)+(n-1)*(m-1);
            if (cost==k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }}}}