package eight;
import java.util.Scanner;
public class fairdivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=0, b=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==1) a++;
                else b++;
            }
            int sum=a+(b*2);
            if(sum%2!=0) {
                System.out.println("NO");
                continue; }
            int half=sum/2;
            if(half%2!=0 && a==0 ){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
    }}}