package eight;

import java.util.Scanner;

public class spacenavi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int px=sc.nextInt();
            int py=sc.nextInt();
            int r=0, l=0, u=0, d=0;
            int R=0, L=0, U=0, D=0;
            String s=sc.next();
            char[] ch=s.toCharArray();
            if(px>0) r=px;
            if(py>0) u=py;
            if(px<0) l=-px;
            if(py<0) d=-py;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='R') R++;
                else if(s.charAt(i)=='L') L++;
                else if(s.charAt(i)=='U') U++;
                else if(s.charAt(i)=='D') D++;
            }
            if(r<=R && l<=L && u<=U && d<=D){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
