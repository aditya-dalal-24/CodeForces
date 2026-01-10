package eight;
import java.util.HashSet;
import java.util.Scanner;
public class horseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<>();
        int[] arr=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
            h.add(arr[i]);
        }
        int l1=h.size();
        int c=4-l1;
        System.out.println(c);
    }}