package java_problemSolving;
import java.util.Scanner;

public class _2VowelOrConsonant2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().toLowerCase().charAt(0);

        if (Character.isLetter(input)) {
            if (isVowel(input)) {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid letter.");
        }
    scanner.close();

    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
