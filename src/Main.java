import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Ange ett nummer eller string som du anser är en palindrom");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (!checkForPalindrome(input)) {
                System.out.println(input + " är inte en palindrom, testa igen");
            } else {
                System.out.println(input + " är en palindrom.");
                break;
            }
        }
    }

    public static boolean checkForPalindrome(String originalWordOrNumber){
        originalWordOrNumber.toCharArray();
        char letter;
        String reverse = "";
        for(int i=0; i<originalWordOrNumber.length(); i++){
            letter = originalWordOrNumber.charAt(i);
            reverse = letter + reverse;
        }

        reverse = reverse.replaceAll("\\s", "");

        if (reverse.equals(originalWordOrNumber.replaceAll("\\s", ""))){
            return true;
        }
        return false;
    }

    public static boolean checkForPalindrome2(String originalWordOrNumber){
        for(int i=0; i<originalWordOrNumber.length()-1; i++){
            if (originalWordOrNumber.charAt(i) == originalWordOrNumber.charAt(originalWordOrNumber.length()-i-1)){
                if (i == originalWordOrNumber.length()-i-1){
                    return true;
                } else if (i == originalWordOrNumber.length()-i){
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
