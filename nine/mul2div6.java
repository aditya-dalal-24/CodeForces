package nine;

import java.util.Scanner;
public class mul2div6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            int c=0;
            if(x==1){
                System.out.println(0);
            break; }
            while(x!=1){
                if(x%6==0){
                    x=x/6;
                    c++;
                }
                if(x%2==0 && x%3==0){
                    x=x*2;
                    c++;
                }
                if(x%2!=0 && x%3!=0) {System.out.println(-1);
                break;}
            }
            System.out.println(c);
        }
    }
}
