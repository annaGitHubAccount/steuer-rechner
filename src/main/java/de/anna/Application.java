package de.anna;

import de.anna.factory.SteuerRechnerFactory;
import de.anna.factory.SteuerRechnerPresentationFactory;
import de.anna.service.SteuerRechner;
import de.anna.service.SteuerRechnerPresentation;

public class Application {

    public void startApp(String stundenLohn) {

        SteuerRechner steuerRechner = SteuerRechnerFactory.getInstance();
        SteuerRechnerPresentation steuerRechnerPresentation = SteuerRechnerPresentationFactory.getInstance();

        int nettoGehalt = steuerRechner.rechneSteuer(Integer.parseInt(stundenLohn));
        steuerRechnerPresentation.anzeigeErgebnis(stundenLohn, nettoGehalt);
    }
}
