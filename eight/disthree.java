package eight;
import java.util.ArrayList;
import java.util.Scanner;
public class disthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k=sc.nextInt();
            ArrayList<Integer> list =new ArrayList<>();
            int j=1;
            while(list.size()<(2*k)){
            if(j%3!=0 && j%10!=3){
                list.add(j);
            }
            j++; }
            System.out.println(list.get(k-1)); }}}