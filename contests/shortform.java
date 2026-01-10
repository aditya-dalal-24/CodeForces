package contest;
import java.util.Scanner;
public class shortform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < t; j++) {
        String s = sc.nextLine().trim();
        char[] ch = s.toCharArray();
        System.out.print(ch[0]);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==' '){
                System.out.print(ch[i+1]);
            }}
            System.out.println();}}}