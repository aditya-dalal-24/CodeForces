package eight;

import java.util.Scanner;

public class prependappend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int x=0;
            char[] arr=s.toCharArray();
            int l=0, r=n-1;
            while(l<r && arr[l]!=arr[r]){
                    l++;
                    r--;
                }
            System.out.println(r-l+1);
        }
    }
}
