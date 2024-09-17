//public class PalindromeCheckerOld {
//    private String original;
//    private String reverse;
//    private final int length;
//
//    public PalindromeChecker(String original) {
//        this.original = original;
//        this.reverse = "";
//        this.length = original.length();
//    }
//
//    public String getOriginal() {
//        return this.original;
//    }
//
//    public void setOriginal(String original) {
//        this.original = original;
//    }
//
//    public String getReverse() {
//        return this.reverse;
//    }
//
//    public int getLength() {
//        return this.length;
//    }
//
//    // Metod för att vända på en sträng
//    public String reverseString(String original) {
//        int length = original.length();
//        for (int i = length - 1; i >= 0; i--) {
//            this.reverse += original.charAt(i);
//        }
//        return this.reverse;
//    }
//
//    // Metod för att kolla om strängen är ett palindrom
//    public boolean isPalindrome(String original) {
//        String reverse = reverseString(original);
//        System.out.println(reverse);
//        System.out.println(original);
//        return original.equals(reverse);
//    }
//}

public class PalindromeChecker {
    // Metod för att vända på en sträng
    public static String reverseString(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }

    // Metod för att kolla om strängen är ett palindrom
    public static boolean isPalindrome(String original) {
        String reverse = reverseString(original);
        return original.equals(reverse);
    }
}
