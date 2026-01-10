package eight;//import java.util.Scanner;
//public class  {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if(i%2==0){
//                sum=sum+i;
//            }
//            if(i%2!=0){
//                sum=sum-i;
//            }}
//        System.out.println(sum); }}
import java.util.Scanner;
public class calcfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long numEven = n / 2;
        long numOdd = (n + 1) / 2;
        long sum = numEven * (numEven + 1) - numOdd * numOdd;
        System.out.println(sum); }}


