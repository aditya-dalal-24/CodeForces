package eight;

import java.util.Scanner;
public class georgeacc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[][] arr= new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 ; j++) {
                arr[i][j]=sc.nextInt();
                if(arr[i][1]-arr[i][0]>=2){
                    c++; }}}
        System.out.println(c); }}
