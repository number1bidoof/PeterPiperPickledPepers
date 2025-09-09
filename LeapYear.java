import java.util.Scanner;

public class LeapYear {
    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int userYear = getIntInput("Please enter in a year, any year: ");
        if (userYear % 100 != 0 && userYear % 4 == 0) { // if the year is divisible by 4 but not 100
            System.out.println(userYear + " is a leap year!");
        } else if (userYear % 400 == 0) { // if the year is divisible by 400
            System.out.println(userYear + " is a leap year!");
        } else{
            System.out.println(userYear + " is NOT leap year!");
        }
    }
}
