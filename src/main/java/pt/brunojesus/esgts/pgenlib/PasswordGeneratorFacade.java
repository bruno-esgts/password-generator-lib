package pt.brunojesus.esgts.pgenlib;


import pt.brunojesus.esgts.pgenlib.model.PasswordRule;
import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;
import pt.brunojesus.esgts.pgenlib.service.PasswordGeneratorService;

/**
 * Facade for Password Generation
 *
 * @version 1.0
 * @since 1.0
 */
public class PasswordGeneratorFacade {

    private final PasswordGeneratorService passwordGeneratorService;

    public PasswordGeneratorFacade() {
        passwordGeneratorService = new PasswordGeneratorService();
    }

    /**
     * Generates a password following the given {@link PasswordRule}
     *
     * @param passwordRule the rule specifying the password strength parameters
     * @return a newly generated password
     */
    public String generatePassword(PasswordRule passwordRule) {
        return passwordGeneratorService.generatePassword(passwordRule);
    }

    /**
     * Generates a password following one of the pre-defines {@link PasswordRule}s on the
     * {@link PasswordStrength}.
     *
     * @param passwordStrength the object specifying the pre-defined rule
     * @return a newly generated password
     */
    public String generatePassword(PasswordStrength passwordStrength) {
        return passwordGeneratorService.generatePassword(passwordStrength);
    }
}
