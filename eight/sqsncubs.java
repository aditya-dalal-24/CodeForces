package eight;
import java.util.HashSet;
import java.util.Scanner;
public class sqsncubs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            HashSet<Long> set=new HashSet<>();
            long i =1;
            while(i*i<=n){
                set.add(i*i);
                i++;
            }
            i = 1;
            while(i*i*i<=n){
                set.add(i*i*i);
                i++;
            }
            System.out.println(set.size());
        }}}