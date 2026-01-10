package eight;
import java.util.Scanner;
public class linetrip{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxFuel = arr[0]; // distance from 0 to first station

            for (int i = 1; i < n; i++) {
                maxFuel = Math.max(maxFuel, arr[i] - arr[i - 1]);
            }

            // last segment (an → x) must be doubled
            maxFuel = Math.max(maxFuel, 2 * (x - arr[n - 1]));

            System.out.println(maxFuel);
        }
    }
}
