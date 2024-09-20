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

    public static String toReverse(String originalWordOrNumber){
        originalWordOrNumber.toCharArray();
        char letter;
        String reverse = "";
        for(int i=0; i<originalWordOrNumber.length(); i++){
            letter = originalWordOrNumber.charAt(i);
            reverse = letter + reverse;
        }
        return reverse;
    }

    public static boolean checkForPalindrome(String originalWordOrNumber){

        String reverse = toReverse(originalWordOrNumber);
        reverse = textFormating(reverse);
        originalWordOrNumber = textFormating(originalWordOrNumber);

        if (reverse.equals(originalWordOrNumber)){
            return true;
        }
        return false;
    }

    public static String textFormating(String text){
        text = text.replaceAll("\\s", "");
        text = text.replaceAll("\\s", "");
        text = text.replaceAll("!", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll("\\.", "");
        text = text.replaceAll("'", "");
        text = text.replaceAll("_", "");
        text = text.toLowerCase();
        return text;
    }
}
