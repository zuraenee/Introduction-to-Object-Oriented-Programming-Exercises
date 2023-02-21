import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("===== Substring Checker =====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string S1 : ");
        String S1 = scanner.next();
        System.out.print("Enter a string S2 : ");
        String S2 = scanner.next();
        if (S1.contains(S2)) {
            System.out.println(S2 + " is a substring of " + S1);
        } else {
            System.out.println(S2 + " is not a substring of " + S1);
        }
    }
}
