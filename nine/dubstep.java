package nine;
import java.util.Scanner;
public class dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.replaceAll("WUB", " ");
        str=str.trim();
        str=str.replaceAll("\\s+", " ");
        System.out.println(str); }}