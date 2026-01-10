package eight;
import java.util.Scanner;
public class andthentherewereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int highestPower = Integer.highestOneBit(n);
            System.out.println(highestPower - 1);
        }

        sc.close();
    }
}
