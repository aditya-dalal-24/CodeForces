package eight;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class beautyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(true){
        n++;
        String s=String.valueOf(n);
        Set<Character> set=new HashSet<>();
        for(char c : s.toCharArray()) set.add(c);
        if(set.size()==s.length()){
            System.out.println(n);
            break; }}}}