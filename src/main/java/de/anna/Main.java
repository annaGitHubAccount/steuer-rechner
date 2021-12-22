package de.anna;

// Edit Configurations / Program arguments: -ss=70

import de.anna.validator.AppArgumentValidator;

public class Main {


    public static void main(String[] args) {

        AppArgumentValidator appArgumentValidator = new AppArgumentValidator();
        appArgumentValidator.validateArgument(args);

        String stundenLohn = getStundenLohn(args[0]);

        Application application = new Application();
        application.startApp(stundenLohn);

    }

    private static String getStundenLohn(String arg) {
        return arg.substring(arg.indexOf("=") + 1);
    }
}
