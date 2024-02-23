import org.junit.Test;
import static org.junit.Assert.*;

public class BlackboxTest {

    @Test
    public void testIsUsernameValid() {
        // Test case 1: Check if the username is at least 3 characters long
        String username = "ab";
        boolean isUsernameValid = username.length() >= 3;
        assertTrue(isUsernameValid);
    }

    @Test
    public void testIsPasswordValid() {
        // Test case 2: Check if the password is at least 8 characters long
        String password = "password";
        boolean isPasswordValid = password.length() >= 8;
        assertTrue(isPasswordValid);

        // Test case 3: Check if the password contains at least one digit
        boolean containsDigit = password.matches(".*\\d.*");
        assertTrue(containsDigit);

        // Test case 4: Check if the password contains at least one special character
        boolean containsSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        assertTrue(containsSpecialChar);

        // Test case 5: Check if the password is valid
        boolean isPasswordValidOverall = isPasswordValid && containsDigit && containsSpecialChar;
        assertTrue(isPasswordValidOverall);
    }
}