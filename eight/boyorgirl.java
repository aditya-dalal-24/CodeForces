package eight;

import java.util.Scanner;
public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++; }
        int c = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i]>0) {
                c++; }}
        if(c%2==0) {
            System.out.println("CHAT WITH HER!");}
        else {
            System.out.println("IGNORE HIM!");
}}}
