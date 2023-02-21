import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Remove all repeated characters ======");
        System.out.print("Please type a string : ");
        String input = scanner.next();
        System.out.println("After removing repeated chars and spaces : " + removeRepeated(input));

    }


    public static String removeRepeated(String input){
        String output = "";
        for (int index = 0 ; index < input.length() ; index++) {
            if (output.indexOf(input.charAt(index)) == -1) {
                output += input.charAt(index);
            }
        }
        return output;
    }

}
