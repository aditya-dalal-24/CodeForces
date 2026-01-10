package contest;
import java.util.Arrays;
import java.util.Scanner;
public class yourname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String t=sc.next();
            char[] n1=s.toCharArray();
            char[] n2=t.toCharArray();
            Arrays.sort(n1);
            Arrays.sort(n2);
            if(n1.length==n2.length){
                if(Arrays.equals(n1,n2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                }
            else{
                    System.out.println("NO");}
        }}}