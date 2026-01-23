package eight;

import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s=sc.next();
            int sum1=0, sum2=0;
            for(int i=0;i<3;i++) {
                sum1+=Integer.parseInt(s.substring(i,i+1));
            }
            for(int i=3;i<s.length();i++) {
                sum2+=Integer.parseInt(s.substring(i,i+1));
            }
            if(sum1==sum2) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
