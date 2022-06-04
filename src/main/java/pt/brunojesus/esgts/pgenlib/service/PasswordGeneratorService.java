package pt.brunojesus.esgts.pgenlib.service;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import pt.brunojesus.esgts.pgenlib.chardata.SpecialChars;
import pt.brunojesus.esgts.pgenlib.model.PasswordRule;
import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;

import java.util.ArrayList;
import java.util.List;

public class PasswordGeneratorService {

    public String generatePassword(PasswordStrength passwordStrength) {
        return generatePassword(passwordStrength.getRule());
    }

    public String generatePassword(PasswordRule rule) {
        List<CharacterRule> characterRules = passwordRuleToCharacterRuleList(rule);

        return generatePassword(rule.getPasswordLength(), characterRules.toArray(new CharacterRule[0]));
    }

    public String generatePassword(int numberOfCharacters, CharacterRule... rules) {

        // If there are no rules, create a default one
        if (rules == null || rules.length == 0) {
            rules = new CharacterRule[]{createLowerCaseRule(1)};
        }

        PasswordGenerator gen = new PasswordGenerator();
        return gen.generatePassword(numberOfCharacters, rules);
    }

    private CharacterRule createLowerCaseRule(int numberOfCharacters) {
        return createRule(EnglishCharacterData.LowerCase, numberOfCharacters);
    }

    private CharacterRule createUpperCaseRule(int numberOfCharacters) {
        return createRule(EnglishCharacterData.UpperCase, numberOfCharacters);
    }

    private CharacterRule createDigitRule(int numberOfCharacters) {
        return createRule(EnglishCharacterData.Digit, numberOfCharacters);
    }

    private CharacterRule createSpecialCharsRule(int numberOfCharacters) {
        return createRule(new SpecialChars(), numberOfCharacters);
    }

    private CharacterRule createRule(CharacterData characterData, int numberOfCharacters) {
        CharacterRule rule = new CharacterRule(characterData);
        rule.setNumberOfCharacters(numberOfCharacters);

        return rule;
    }

    private List<CharacterRule> passwordRuleToCharacterRuleList(PasswordRule rule) {
        List<CharacterRule> characterRules = new ArrayList<>();

        if (rule.getLowerCaseChars() > 0) {
            characterRules.add(createLowerCaseRule(rule.getLowerCaseChars()));
        }

        if (rule.getUpperCaseChars() > 0) {
            characterRules.add(createUpperCaseRule(rule.getUpperCaseChars()));
        }

        if (rule.getNumericChars() > 0) {
            characterRules.add(createDigitRule(rule.getNumericChars()));
        }

        if (rule.getSpecialChars() > 0) {
            characterRules.add(createSpecialCharsRule(rule.getSpecialChars()));
        }

        return characterRules;
    }
}
