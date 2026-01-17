package contest;

import java.util.Scanner;

public class arraycoloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        boolean f=true;
        for(int j=0;j<n-1;j++)
        {
            if(Math.abs(arr[j]-arr[j+1])%2==0){
                f=false;
                break;
            }
        }
        System.out.println(f?"YES":"NO");
    }
}}
