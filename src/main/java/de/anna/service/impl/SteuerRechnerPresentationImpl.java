package de.anna.service.impl;

import de.anna.service.SteuerRechnerPresentation;

public class SteuerRechnerPresentationImpl implements SteuerRechnerPresentation {

    public void anzeigeErgebnis(String stundenLohn, int nettoGehalt) {

        System.out.println("Stundenlohn: " + stundenLohn + " EUR");
        System.out.println("Netto Gehalt beträgt im Monat: " + nettoGehalt + " EUR");
    }
}
