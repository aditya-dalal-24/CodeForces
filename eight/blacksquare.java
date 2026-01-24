package eight;
import java.util.Scanner;
public class blacksquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        String s = sc.next();
        int totcal = 0;
        for (int i = 0; i < s.length(); i++) {
            int strip = s.charAt(i) - '1';
            totcal += a[strip];
        }
        System.out.println(totcal);
    }}