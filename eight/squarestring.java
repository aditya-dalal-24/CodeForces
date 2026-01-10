package eight;
import java.util.Scanner;
public class squarestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(s.length()%2!=0){
                System.out.println("NO");
            }
            else{
                if(s.length()==2 && s.charAt(0)==s.charAt(1)){
                    System.out.println("YES");
                }
                else if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
                    System.out.println("NO");
                }
                else{
                int m=s.length()/2;
                String s1=s.substring(0,m);
                String s2=s.substring(m);
                if(s1.equals(s2)){
                    System.out.println("YES"); }
                else{
                    System.out.println("NO");
                }}
        }}}}