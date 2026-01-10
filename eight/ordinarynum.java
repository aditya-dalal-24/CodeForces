package eight;
//import java.util.Scanner;
//public class ordinarynum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long t=sc.nextLong();
//        for (int i = 0; i < t; i++) {
//            long n=sc.nextLong();
//            long c=0;
//            for (int j = 1; j <= n; j++) {
//                if(j<10 || j%11==0){
//                    c++; }}
//            System.out.println(c); }}}
import java.util.Scanner;
public class ordinarynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            for (int d = 1; d <= 9; d++) {
                long num = d;
                while (num <= n) {
                    count++;
                    num = num * 10 + d; }}
            System.out.println(count); }
        sc.close(); }}