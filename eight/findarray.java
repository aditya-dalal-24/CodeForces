package eight;
import java.util.Scanner;
public class findarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        if(n==1) System.out.print(1);
        else{
            for (int i = 2; i < (n+2) ; i++) {
                System.out.print(i+" ");
            }}
            System.out.println();
        }}}