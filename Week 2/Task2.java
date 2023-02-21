import java.util.Random;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        int num = 0;

        do {
            int a = random.nextInt(10);
            if (a % 2 == 0) {
                System.out.println("" + a + " ");
                ++num;
            }
        } while(num != 5);

    }
}
