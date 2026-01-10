package contest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class desofdandf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            long sumeven = 0;
            long sumodd = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x%2==0) even.add(x);
                else odd.add(x);
            }
            if (odd.isEmpty()) {
                System.out.println(0);
                continue;
            }
            Collections.sort(odd);
            Collections.sort(even, Collections.reverseOrder());
            ArrayList<Integer> oddAlt = new ArrayList<>();
            int left=0;
            int right=odd.size()-1;
            boolean altmax =true;
            while (left <= right) { 
                if (altmax) {
                    oddAlt.add(odd.get(right));
                    right--; }
                else {
                    oddAlt.add(odd.get(left));
                    left++; }
                altmax = !altmax;
            }
            boolean on = false;
            on=!on;
            sumodd+=oddAlt.get(0);
            for (int x : even) {
                if(on) sumeven+=x;
            }
            for (int j = 1; j < oddAlt.size(); j++) {
                int x = oddAlt.get(j);
                on=!on;
                if(on) sumodd += x;
            }
            System.out.println(sumeven+sumodd); }}}