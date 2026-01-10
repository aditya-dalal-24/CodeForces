package eight;

import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int u=0, l=0;
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                u++;
            }
            else if(Character.isLowerCase(arr[i])){
                l++;
            }}
        if(u>l){
            System.out.println(str.toUpperCase());
        }
        if(l>=u){
            System.out.println(str.toLowerCase()); }}}
