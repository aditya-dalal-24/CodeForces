package eight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class fairplayoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<4;i++){
            arr.add(sc.nextInt()); }
            int a=Math.max(arr.get(0),arr.get(1));
            int b=Math.max(arr.get(2),arr.get(3));
            int max= Collections.max(arr);
            arr.remove((Integer) max);
            int max2=Collections.max(arr);
            if((a==max || a==max2) && (b==max || b==max2)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO"); }}}}