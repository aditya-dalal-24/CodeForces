package eight;
import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            if (n < 9) {
                System.out.println(0);
            } else {
                long count = (n - 9) / 10 + 1;
                System.out.println(count);
            }}
        sc.close(); }}