package eight;

import java.util.Scanner;

public class soldbanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();
        int s=0;
        for(int i=1;i<=w;i++) { s+=i; }
        int t = k*s;
        int m=t-n;
        System.out.println(m);
    }
}
