public class Main {
    public static void main(String[] args) {
        String original = " ";
        String reverse = " ";
        while (true) {
            System.out.println("Ange ett nummer eller string som du anser är en palindrom");
            Scanner in = new Scanner(System.in);
            if (!checkForPalindrome(in.nextLine())) {
                System.out.println("\" \" är inte en palindrom, testa igen");
            } else {
                System.out.println(\" \" är en palindrom.");
                break;
            }
        }
    }
}
