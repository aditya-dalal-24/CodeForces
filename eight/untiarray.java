package eight;

import java.util.Scanner;

public class untiarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int c=0, sum=0, step=0;
            int n=sc.nextInt();
            int[]  arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }
            for (int i = 0; i < n; i++) {
                if(arr[i]==-1){
                    c++;
                }}
            if(c%2!=0){



            }
        }

    }
}
