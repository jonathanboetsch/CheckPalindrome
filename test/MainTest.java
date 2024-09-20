import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("Check for validity of the methods' output against words")
    public static void testCheckForPalindromeAgainstWords() {
        assertEquals(true, Main.checkForPalindrome("coloc"));
        assertEquals(true, Main.checkForPalindrome("kayak"));
        assertEquals(true, Main.checkForPalindrome("noon"));
    }

    @Test
    @DisplayName("Check for validity of the methods' output against sentences")
    public static void testCheckForPalindromeAgainstSentences() {
        assertEquals(false, Main.checkForPalindrome("Never odd or even"));
        assertEquals(false, Main.checkForPalindrome("Don’t nod"));
        assertEquals(false, Main.checkForPalindrome("A man, a plan, a canal, Panama!"));
        assertEquals(false, Main.checkForPalindrome("Step on no pets!"));
    }
    @Test
    @DisplayName("Check for validity of the methods' output against numbers")
    public static void testCheckForPalindromeAgainstNumbers() {
        assertEquals(false, Main.checkForPalindrome("888"));
        assertEquals(false, Main.checkForPalindrome("1,234,321"));
        assertEquals(false, Main.checkForPalindrome("2/2/22"));
    }
}
