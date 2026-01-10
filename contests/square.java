package contest;
import java.util.Arrays;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<4;i++){
                if(arr[i]==0){
                    System.out.println("NO");
                }}
            if(arr[0]==arr[3]){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }}}}