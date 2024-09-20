
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    void shouldReverseString() {
        assertEquals("emordnilap", PalindromeChecker.reverseString("palindrome"));
    }

    @Test
    void shouldResolveAsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("kayak"));
    }

    @Test
    void shouldNotResolveAsPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("mesopotamia"));
    }

    @Test
    void shouldHandleEmptyString() {
        // Kollar om en tom strän räknas som ett palindrom
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void shouldHandleSpecialCharacters() {
        // Kollar att palindrom funkar även om strängen har mellanslag och specialtecken
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"
                                                 .replaceAll("[^A-Za-z0-9]", "").toLowerCase()));
    }

    @Test
    void shouldNotReverseString(){
        assertNotEquals("palindrome", PalindromeChecker.reverseString("palindrome"));
    }
}
