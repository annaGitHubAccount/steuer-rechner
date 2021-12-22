package de.anna.factory;

import de.anna.service.SteuerRechner;
import de.anna.service.impl.SteuerRechnerImpl;

public class SteuerRechnerFactory {

    public static SteuerRechner getInstance() {
        return new SteuerRechnerImpl();
    }
}
