package contest;

import java.util.*;

public class gravityfalls1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            List<List<Integer>> arrays = new ArrayList<>();
            int maxLen = 0;
            for (int i = 0; i < n; i++) {
                int k = scanner.nextInt();
                List<Integer> arr = new ArrayList<>();
                for (int j = 0; j < k; j++) {
                    arr.add(scanner.nextInt());
                }
                arrays.add(arr);
                maxLen = Math.max(maxLen, k);
            }

            // For each column, collect all values that could end up there
            List<List<Integer>> columns = new ArrayList<>();
            for (int i = 0; i < maxLen; i++) {
                columns.add(new ArrayList<>());
            }

            for (List<Integer> arr : arrays) {
                for (int i = 0; i < arr.size(); i++) {
                    columns.get(i).add(arr.get(i));
                }
            }

            // For each bottom row cell, choose the minimum among available numbers
            StringBuilder result = new StringBuilder();
            for (List<Integer> col : columns) {
                Collections.sort(col);
                result.append(col.get(0)).append(" "); // Always pick the minimum
            }
            System.out.println(result.toString().trim());
        }
    }
}
