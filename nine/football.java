package nine;

import java.util.Scanner;
public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean f=false;
        int c=1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
        if(c>=7){
            f=true;
            break;}}
    else{
            c=1; }}
            if(f){
                System.out.println("YES"); }
            else {
                System.out.println("NO"); }
}}
