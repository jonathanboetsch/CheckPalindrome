import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    @DisplayName("Check for validity of the methods' output against words")
    public void testCheckForPalindromeAgainstWords() {
        assertEquals(true, Main.checkForPalindrome("coloc"));
        assertEquals(true, Main.checkForPalindrome("kayak"));
        assertEquals(true, Main.checkForPalindrome("noon"));
    }

    @Test
    @DisplayName("Check for validity of the methods' output against sentences")
    public void testCheckForPalindromeAgainstSentences() {
        assertEquals(true, Main.checkForPalindrome("Never odd or even"));
        assertEquals(true, Main.checkForPalindrome("Don’t nod"));
        assertEquals(true, Main.checkForPalindrome("A man, a plan, a canal, Panama!"));
        assertEquals(true, Main.checkForPalindrome("Step on no pets!"));
    }
    @Test
    @DisplayName("Check for validity of the methods' output against numbers")
    public void testCheckForPalindromeAgainstNumbers() {
        assertEquals(true, Main.checkForPalindrome("888"));
        assertEquals(true, Main.checkForPalindrome("1,234,321"));
        assertEquals(true, Main.checkForPalindrome("2/2/22"));
    }
}
