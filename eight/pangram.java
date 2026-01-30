package eight;
import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(Character.toLowerCase(ch));
            }}
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }}}