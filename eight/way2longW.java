package eight;

import java.util.Scanner;
public class way2longW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<x; i++)
        { String s = sc.nextLine();
        int y=s.length();
        if(y>10) {
            char[] ch = s.toCharArray();
            System.out.println(""+ch[0]+(y-2)+ch[y-1]); }
            else { System.out.println(s); }}}}
