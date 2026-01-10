package eight;

import java.util.Scanner;

public class antondanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0, d=0;
        String s = sc.next();
        if(s.length()>n) { return; }
        char[] ch= new char[s.length()];
        ch=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == 'A') {
                a++;
            }
            if (ch[i] == 'D') {
                d++;
            }
        }
        if(a>d) {
            System.out.println("Anton");
        }
        else if(a<d) { System.out.println("Danik"); }
        else {
            System.out.println("Friendship");
    }
}}
