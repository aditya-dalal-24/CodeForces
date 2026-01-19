package contest;
import java.util.Scanner;
public class prefixmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {   int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int max=0, idx=0, temp;
            for (int i = 0; i < n; i++) {
                if(arr[i]>max) {
                    max=arr[i];
                    idx=i;
                }}
            temp=arr[idx];
            arr[idx]=arr[0];
            arr[0]=temp;
            System.out.println(max*n);
            }}}