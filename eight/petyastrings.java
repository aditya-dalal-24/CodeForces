package eight;

import java.util.Scanner;
public class petyastrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int r = a.compareTo(b);
        if(r<0){
            System.out.println("-1"); }
        else if (r>0) {
            System.out.println("1");}
        else {
            System.out.println("0"); }}}
