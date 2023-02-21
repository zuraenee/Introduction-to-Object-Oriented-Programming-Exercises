import java.util.Scanner;

public class AverageGrades {
    public static int Average(int grades[]) {
        int Sum = 0;
        for (int index = 0 ; index < grades.length ; index++) {
            Sum += grades[index];
        }
        return Sum / grades.length;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] grades = new int[20];
        for (int index = 0 ; index < 20 ; index++) {
            System.out.printf("Enter a grade: ");
            int tempGrade = Input.nextInt();
            if (tempGrade < 0) {
                break;
            } else {
                grades[index] = tempGrade;
            }
        }
        double averager = Average(grades);
        System.out.println("The average is " + averager);
    }
}
