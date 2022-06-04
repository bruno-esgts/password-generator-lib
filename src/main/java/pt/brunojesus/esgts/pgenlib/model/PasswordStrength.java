package pt.brunojesus.esgts.pgenlib.model;

public enum PasswordStrength {

    WEAK(
            new PasswordRule()
                    .setPasswordLength(6)
                    .setUpperCaseChars(2)
                    .setLowerCaseChars(3)
                    .setNumericChars(1)
    ), REGULAR(
            new PasswordRule()
                    .setPasswordLength(10)
                    .setUpperCaseChars(3)
                    .setLowerCaseChars(3)
                    .setNumericChars(2)
                    .setSpecialChars(2)
    ), STRONG(
            new PasswordRule()
                    .setPasswordLength(12)
                    .setUpperCaseChars(3)
                    .setLowerCaseChars(4)
                    .setNumericChars(2)
                    .setSpecialChars(3)
    ), SUPER_STRONG(
            (
                    new PasswordRule()
                            .setPasswordLength(14)
                            .setUpperCaseChars(4)
                            .setLowerCaseChars(4)
                            .setNumericChars(2)
                            .setSpecialChars(4)
            )
    ), THANOS(
            (
                    new PasswordRule()
                            .setPasswordLength(48)
                            .setUpperCaseChars(1)
                            .setLowerCaseChars(1)
                            .setNumericChars(1)
                            .setSpecialChars(1)
            )
    );

    final PasswordRule rule;

    PasswordStrength(PasswordRule rule) {
        this.rule = rule;
    }

    public PasswordRule getRule() {
        return rule;
    }
}
