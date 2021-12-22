package de.anna.validator;

import de.anna.exception.AppParameterException;

public class AppArgumentValidator {

    public void validateArgument(String[] args) {

        if (args.length != 1) {
            throw new AppParameterException("Die Anzahl von Parameter ist falsch. Es soll 1 Parameter geben.");
        }
    }
}
