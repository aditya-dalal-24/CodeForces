package eight;
import java.util.Scanner;
public class boringapt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int a=x%10;
            int sum=(a-1)*10;
            if(x<10) sum+=1;
            else if(x<100) sum+=3;
            else if(x<1000) sum+=6;
            else sum+=10;
            System.out.println(sum);
        }}}