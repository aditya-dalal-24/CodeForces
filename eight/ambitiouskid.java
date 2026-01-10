package eight;
import java.util.Arrays;
import java.util.Scanner;
public class ambitiouskid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); }
        for (int i = 0; i < n; i++) {
            if(arr[i]==0) {
                System.out.println(0);
                return;
            }
            else if(arr[i]<0){
                arr[i]=-arr[i];  }
        }
        Arrays.sort(arr);
        System.out.println(arr[0]); }}
