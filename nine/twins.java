package nine;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int sum=0, tsum=0, c=0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<n;i++)sum+=arr[i];
        for(int i=0;i<n;i++){
            tsum+=arr[i];
            if(tsum>(sum/2)){
                c=i;
                break;
            }}
        System.out.println(c+1);
    }}