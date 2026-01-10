package eight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class blankspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<Integer>();
            int c=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    c++;
                }
                if(arr[i]==1){
                    a.add(c);
                    c=0;
                }}
            a.add(c);
            System.out.println(Collections.max(a));
        }}}