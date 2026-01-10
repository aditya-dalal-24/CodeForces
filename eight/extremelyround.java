package eight;
import java.util.Scanner;
public class extremelyround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            int len=n.length();
            int f=n.charAt(0)-'0';
            int r=9*(len-1)+f;
            System.out.println(r);
            }}}