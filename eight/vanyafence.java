package eight;

import java.util.Scanner;

public class vanyafence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int w=0;
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); }
        for (int i = 0; i < n; i++) {
            if(arr[i]>h){
                w=w+2; }
            else if(arr[i]<=h){
            w=w+1;}}
        System.out.println(w); }}