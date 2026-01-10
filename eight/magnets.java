package eight;

import java.util.Scanner;
public class magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return; }
            sc.nextLine();
            String prev=sc.nextLine().trim();
            int grp=1;
        for (int i = 1; i < n; i++) {
            String curr=sc.nextLine().trim();
            if(!curr.equals(prev)){
            grp++; }
            prev=curr;}
            System.out.println(grp);
        }}