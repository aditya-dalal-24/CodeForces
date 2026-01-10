package eight;
import java.util.Scanner;
public class oddset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {   int o=0,e=0;
            int n=sc.nextInt();
            int[] arr=new int[2*n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    e++; }
                if(arr[i]%2!=0) {
                    o++; }}
            if(o==e){
                System.out.println("YES"); }
            else{
                System.out.println("NO"); }
        }}}