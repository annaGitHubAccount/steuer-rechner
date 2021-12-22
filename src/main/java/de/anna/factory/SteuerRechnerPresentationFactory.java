package de.anna.factory;

import de.anna.service.SteuerRechnerPresentation;
import de.anna.service.impl.SteuerRechnerPresentationImpl;

public class SteuerRechnerPresentationFactory {

    public static SteuerRechnerPresentation getInstance() {
        return new SteuerRechnerPresentationImpl();
    }
}
