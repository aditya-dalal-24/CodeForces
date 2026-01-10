package eight;
import java.util.Scanner;
public class luntikoncerts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long s=a+2*b+3*c;
            System.out.println(s%2);
        }}}