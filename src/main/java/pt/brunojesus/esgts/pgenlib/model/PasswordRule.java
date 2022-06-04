package pt.brunojesus.esgts.pgenlib.model;

public class PasswordRule {

    private int upperCaseChars = 0;
    private int lowerCaseChars = 0;
    private int numericChars = 0;
    private int specialChars = 0;
    private int passwordLength = 0;

    public PasswordRule() {
    }

    public int getUpperCaseChars() {
        return upperCaseChars;
    }

    public PasswordRule setUpperCaseChars(int upperCaseChars) {
        this.upperCaseChars = upperCaseChars;
        return this;
    }

    public int getLowerCaseChars() {
        return lowerCaseChars;
    }

    public PasswordRule setLowerCaseChars(int lowerCaseChars) {
        this.lowerCaseChars = lowerCaseChars;
        return this;
    }

    public int getNumericChars() {
        return numericChars;
    }

    public PasswordRule setNumericChars(int numericChars) {
        this.numericChars = numericChars;
        return this;
    }

    public int getSpecialChars() {
        return specialChars;
    }

    public PasswordRule setSpecialChars(int specialChars) {
        this.specialChars = specialChars;
        return this;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public PasswordRule setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
        return this;
    }
}
