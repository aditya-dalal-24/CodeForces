    package eight;
    import java.util.Scanner;
    public class gcdsum {
        static long gcd(long a,long b){    //Euclid's GCD Algorithm
            while(b!=0){
                long temp=a%b;
                a=b;
                b=temp;
            }
            return a;
        }
        static long lcm(int a,int b){
            return (long)a*b/gcd(a,b);
        }
        static long digitsum(long n){
            long sum=0;
            while(n!=0){
                sum+=n%10;
                n=n/10;
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                long n=sc.nextLong();
                long x=n;
                while(gcd(x, digitsum(x))==1){
                    x++;
                }
                System.out.println(x);
    }}}
