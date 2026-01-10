package eight;
import java.util.Scanner;
public class legs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0 || n%2!=0){
                System.out.println("0"); }
            else{
                int x=0;
                if(n%4==0){
                    x=n/4; }
                else{
                    x=(n/4)+1;
                }
            System.out.println(x);
            }
        }}}