package pt.brunojesus.esgts.pgenlib.chardata;

import org.passay.CharacterData;

import static org.passay.AllowedCharacterRule.ERROR_CODE;

public class SpecialChars implements CharacterData {

    @Override
    public String getErrorCode() {
        return ERROR_CODE;
    }

    @Override
    public String getCharacters() {
        return "!@#$%&*()_+{}[]'\"<>?-,.";
    }
}
