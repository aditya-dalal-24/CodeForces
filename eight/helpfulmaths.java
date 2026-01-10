package eight;

import java.util.ArrayList;
import java.util.Scanner;
public class helpfulmaths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch =  str.toCharArray();
        ArrayList list = new ArrayList();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='1' || ch[i]=='2' || ch[i]=='3'){
                list.add(ch[i]);
            }}
            list.sort(null);
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                list.add(i, '+');
            }
            System.out.print((char) list.get(i));
        }}}
