import java.util.Scanner;

public class Task1 {
    public static double area(double a, double b, double c) {
        double triArea = (a*b) / 2;
        return triArea;
    }

    public static double perimeter(double a, double b, double c) {
        double triPeri = a + b + c;
        return triPeri;
    }

    public static boolean isValid(double a, double b, double c) {
        boolean valid = a+b>c && a+c>b && b+c>a;
        return valid;
    }

    public static void main(String[] args) {
        System.out.println(area(2,3,4));
        System.out.println(perimeter(2,3,4));
        System.out.println(isValid(2,3,4));

        Scanner Input = new Scanner(System.in);
        System.out.printf("Enter length a: ");
        double a = Input.nextDouble();
        System.out.printf("Enter length b: ");
        double b = Input.nextDouble();
        System.out.printf("Enter length c: ");
        double c = Input.nextDouble();

        if (a == -1) {
            System.out.println("Bye");
            return;
        } else {
            boolean valid = isValid(a, b, c);
            if (valid) {
                double triArea = area(a, b, c);
                double triPeri = perimeter(a, b, c);
                System.out.println("Area: " + triArea);
                System.out.println("Perimeter: " + triPeri);
            } else {
                System.out.println("The input is invalid.");
            }
        }
    }
}
