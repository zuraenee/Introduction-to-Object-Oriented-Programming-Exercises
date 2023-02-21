public class Task4 {
    public Task4() {
    }

    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.printf("Enter month number: ");
        int month = SN.nextInt();
        byte days;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 31;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 28;
                break;
            case 5:
                days = 30;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 31;
                break;
            case 12:
                days = 30;
                break;
            default:
                days = 0;
                System.out.println("error!!!");
        }

        if (days != 0) {
            System.out.println("Number of days in " + month + " month is: " + days);
        } else {
            System.out.println("You have entered an invalid month!!!");
        }

    }
}
