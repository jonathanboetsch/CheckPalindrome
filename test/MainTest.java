import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
    @Test
    @DisplayName("Check for validity of the methods' output against words")
    public void testCheckForPalindromeAgainstWords() {
        assertTrue(Main.checkForPalindrome("coloc"));
        assertTrue(Main.checkForPalindrome("kayak"));
        assertTrue(Main.checkForPalindrome("noon"));
    }

    @Test
    @DisplayName("Test checkForPalindrome() against sentences")
    public void testCheckForPalindromeAgainstSentences() {
        assertTrue(Main.checkForPalindrome("Never odd or even"));
        assertTrue(Main.checkForPalindrome("Don’t nod"));
        assertTrue(Main.checkForPalindrome("A man, a plan, a canal, Panama!"));
        assertTrue(Main.checkForPalindrome("Step on no pets!"));
    }

    @Test
    @DisplayName("Test checkForPalindrome() against numbers")
    public void testCheckForPalindromeAgainstNumbers() {
        assertTrue(Main.checkForPalindrome("888"));
        assertTrue(Main.checkForPalindrome("1,234,321"));
    }

    @Test
    @DisplayName("Check cleanText() output")
    public void testCleanText() {
        assertEquals("neveroddoreven", Main.formatText("Never odd or even"));
        assertEquals("dontnod", Main.formatText("Don’t nod"));
        assertEquals("amanaplanacanalpanama", Main.formatText("A man, a plan, a canal, Panama!"));
    }

    @Test
    @DisplayName("Check for validity of toReverse method")
    public void testToReverseMethod() {
        // assertEquals("emordnilap", Main.toReverse("palindrome"));
        assertEquals("rakso", Main.toReverse("oskar"));
        assertEquals("nahtanoJ", Main.toReverse("Jonathan"));
    }
}
