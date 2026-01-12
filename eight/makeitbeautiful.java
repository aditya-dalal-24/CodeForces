package eight;

import java.util.Arrays;
import java.util.Scanner;

public class makeitbeautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] == arr[n - 1]) {
                System.out.println("NO");
                continue;
            }
            int l = 0, r = n - 1;
            int[] s = new int[n];
            int j = 0;
            while (l <= r) {
                if (l == r) {
                    s[j] = arr[l];
                    j++;
                } else {
                    s[j++] = arr[l];
                    s[j++] = arr[r];
                }
                l++;
                r--;
            }
            System.out.println("YES");
            for (int x : s) {
                System.out.print(x + " ");
            }
            System.out.println();
        }}}