package nine;

import java.util.Scanner;
public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        boolean f = false;
        for (int i = 0; i < ch.length ; i++) {
            if(ch[i]=='H' || ch[i]=='Q' || ch[i]=='9') {
                f = true;
            }}
        if(f) {
            System.out.println("YES"); }
        else {
            System.out.println("NO"); }}}
