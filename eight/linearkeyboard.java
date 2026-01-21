package eight;
import java.util.Scanner;
public class linearkeyboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        String k=sc.next();
        String s=sc.next();
        char[] key=k.toCharArray();
        char[] w=s.toCharArray();
        int[] ind=new int[w.length];
        int time=0;
        int x=0;
        for (char c:w){
            for (int j=0;j<key.length;j++) {
                if (key[j]==c) {
                        ind[x++]=j+1;
                }}}
        for(int i=1; i<w.length;i++) {
            time=time+Math.abs(ind[i]-ind[i-1]);
            }
        System.out.println(time);
        }}}