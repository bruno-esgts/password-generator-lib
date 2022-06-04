package pt.brunojesus.esgts.pgenlib;

import org.junit.jupiter.api.Test;
import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorFacadeTest {


    private final PasswordGeneratorFacade subject = new PasswordGeneratorFacade();

    @Test
    void weakPasswordTest() {
        final String password = subject.generatePassword(PasswordStrength.WEAK);
        assertNotNull(password);
        assertEquals(6, password.length());
    }

    @Test
    void regularPasswordTest() {
        final String password = subject.generatePassword(PasswordStrength.REGULAR);
        assertNotNull(password);
        assertEquals(10, password.length());
    }

    @Test
    void strongPasswordTest() {
        final String password = subject.generatePassword(PasswordStrength.STRONG);
        assertNotNull(password);
        assertEquals(12, password.length());
    }

    @Test
    void superStrongPasswordTest() {
        final String password = subject.generatePassword(PasswordStrength.SUPER_STRONG);
        assertNotNull(password);
        assertEquals(14, password.length());
    }

    @Test
    void thanosPasswordTest() {
        final String password = subject.generatePassword(PasswordStrength.THANOS);
        assertNotNull(password);
        assertEquals(48, password.length());
    }
}