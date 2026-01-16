package eight;
import java.util.Scanner;
public class hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print("I ");
            if(i%2==0){
                System.out.print("love ");
            }
            if(i%2!=0){
                System.out.print("hate ");
            }
            if(i!=n){
                System.out.print("that ");
            }
            else System.out.print("it");
        }
    }
}
