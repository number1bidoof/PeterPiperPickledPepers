import java.util.Scanner;

public class ChineseZodiac {
    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int userYear = getIntInput("Please enter a year, any year: ");
        int userZodiac = userYear % 12;
        switch (userZodiac) {
            case 0:
                System.out.println("Your Chinese Zodiac for the Monkey in " + userYear);
                break;
            case 2:
                System.out.println("Your Chinese Zodiac is the Rooster in " + userYear);
                break;
            case 3:
                System.out.println("Your Chinese Zodiac is the Dog in " + userYear);
                break;
            case 4:
                System.out.println("Your Chinese Zodiac is the Pig in " + userYear);
                break;
            case 5:
                System.out.println("Your Chinese Zodiac is the Ox in " + userYear);
                break;
            case 6:
                System.out.println("Your Chinese Zodiac is the Tiger in " + userYear);
                break;
            case 7:
                System.out.println("Your Chinese Zodiac is the Rabbit in " + userYear);
                break;
            case 8:
                System.out.println("Your Chinese Zodiac is the Dragon in " + userYear);
                break;
            case 9:
                System.out.println("Your Chinese Zodiac is the Snake in " + userYear);
                break;
            case 10:
                System.out.println("Your Chinese Zodiac is the Horse in " + userYear);
                break;
            case 11:
                System.out.println("Your Chinese Zodiac is the Sheep in " + userYear);
                break;
        }
    }
}
