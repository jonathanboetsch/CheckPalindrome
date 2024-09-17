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
}
