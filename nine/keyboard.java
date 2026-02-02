package nine;
import java.util.Scanner;
public class keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char dir = sc.next().charAt(0);
        String s = sc.next();
        String kb = "qwertyuiopasdfghjkl;zxcvbnm,./";
        for (int i = 0; i < s.length(); i++) {
            int ind=kb.indexOf(s.charAt(i));
            System.out.print(dir=='L'?kb.charAt(ind+1):kb.charAt(ind-1));
        }}}