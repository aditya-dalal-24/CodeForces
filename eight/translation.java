package eight;

import java.util.Scanner;
public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] ch=s.toCharArray();
        int b=0, e= ch.length-1;
        while(b<e){
            char temp=ch[b];
            ch[b]=ch[e];
            ch[e]=temp;
            b++;
            e--; }
        String n = new String(ch);
        if(n.equals(t)){
            System.out.println("YES"); }
        else {
            System.out.println("NO"); }}}
