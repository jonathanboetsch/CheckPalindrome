import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a string/number to check if it is a palindrome: ");
            String original = sc.nextLine();

            if (PalindromeChecker.isPalindrome(original)) {
                System.out.println("\"" + original + "\"" + "... is a palindrome");
                break;
            } else {
                System.out.println("\"" + original + "\"" + "... is not a palindrome");
            }
        } while (true);
    }
}
