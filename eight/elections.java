package eight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class elections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int p=0,q=0,r=0;
            ArrayList<Integer> a=new ArrayList<>();
            for (int i=0;i<3;i++){
                a.add(sc.nextInt());
            }
            int max=Collections.max(a);
            int x=a.get(0);
            int y=a.get(1);
            int z=a.get(2);
            int cnt = 0;
            for(int v : a) if(v == max) cnt++;
            if(x==y && y==z){
                p=q=r=1;
            }
            else if(max==x){
                p=(cnt==1?0:max-x+1);
                q=max-y+1;
                r=max-z+1;
            }
            else if(max==y){
                p=max-x+1;
                q=(cnt==1?0:max-y+1);
                r=max-z+1;
            }
            else if(max==z){
                p=max-x+1;
                q=max-y+1;
                r=(cnt==1?0:max-z+1);
            }
            System.out.println(p+" "+q+" "+r);
        }}}