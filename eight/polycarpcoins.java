package eight;
import java.util.Scanner;
public class polycarpcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int c1,c2;
            c1 = arr[i]/3;
            c2 = arr[i]/3;
            if(arr[i]%3==1){
                c1=c1+1;
            }
            if((arr[i]%3==2)){
                c2=c2+1;
            }
            System.out.println(c1+" "+c2); }}}