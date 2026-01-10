package eight;

import java.util.Scanner;
public class nearlylucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '4' || ch == '7') {
                c++;
            }
        }
        if (c == 4 || c == 7) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}