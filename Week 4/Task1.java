import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Major and Status ======");
        System.out.print("Enter two characters : ");
        String input = scanner.next();
        char major = input.charAt(0);
        char status = input.charAt(1);
        System.out.println(major + " " +  status);
        if (major == 'M') {
            System.out.print("Mathematics");
        } else if (major == 'C') {
            System.out.print("Computer Science");
        } else if (major == 'I') {
            System.out.print("Information Technology");
        } else {
            System.out.println("Invalid input");
        }
        if (status == '1') {
            System.out.print(" Freshman");
        } else if (status == '2') {
            System.out.print(" Sophomore");
        } else if (status == '3') {
            System.out.print(" Junior");
        } else if (status == '4') {
            System.out.print(" Senior");
        } else {
            System.out.println("Invalid input");
        }

    }
}
