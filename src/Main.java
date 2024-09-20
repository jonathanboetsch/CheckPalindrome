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
}
