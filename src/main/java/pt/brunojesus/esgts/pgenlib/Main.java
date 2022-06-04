package pt.brunojesus.esgts.pgenlib;

import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;

public class Main {

    public static void main(String[] args) {
        final PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();

        String password = passwordGeneratorFacade.generatePassword(PasswordStrength.STRONG);

        System.out.println("Your new password is: " + password);
    }
}
