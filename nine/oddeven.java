package nine;

import java.util.ArrayList;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(i%2!=0){ list.add(i); }
        }
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                 list.add(j);
            }
        }
        System.out.println(list.get(k-1));
        }

        }