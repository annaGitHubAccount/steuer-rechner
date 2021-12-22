package de.anna.service.impl;

import de.anna.data.DataProvider;
import de.anna.model.SteuerTabelleZeile;
import de.anna.service.SteuerRechner;
import de.anna.utils.CollectionsUtils;

import java.util.List;

public class SteuerRechnerImpl implements SteuerRechner {

    private final static int TAGE_PRO_MONAT = 21;
    private final static int STUNDEN_PRO_TAG = 8;
    private final static int CONSTANT_STEUER = 1000;


    public int rechneSteuer(int stundenLohn) {

        if (stundenLohn == 0) {
            return rechneSteuerAusSteuerTabelle(0);
        }

        int einkommenProMonat = stundenLohn * STUNDEN_PRO_TAG * TAGE_PRO_MONAT;
        int einkommen = einkommenProMonat - CONSTANT_STEUER;
        return rechneSteuerAusSteuerTabelle(einkommen);
    }

    private int rechneSteuerAusSteuerTabelle(int einkommen) {

        DataProvider dataProvider = new DataProvider();
        List<SteuerTabelleZeile> steuerTabelleListe = dataProvider.getSteuerTabelle();

        SteuerTabelleZeile lastObjektInDerListe = CollectionsUtils.getLastElementOfList(steuerTabelleListe);

        if (einkommen == 0) {
            return 0;
        }

        if (einkommen >= lastObjektInDerListe.getEinkommen()) {
            return einkommen - lastObjektInDerListe.getSteuer();
        }

        /* Java8 macht leider das komplizierter:
        final SteuerTabelleZeile[] vorherigeSteuerTabelleZeile = {null};

        return steuerTabelleListe.stream()
                .filter(tabelle -> tabelle.getEinkommen() >= einkommen)
                .map(steuerTabelleZeile -> {
                    SteuerTabelleZeile laufendeZeile = vorherigeSteuerTabelleZeile[0] == null ? steuerTabelleZeile : vorherigeSteuerTabelleZeile[0];
                    int steuerZuBezahlen = laufendeZeile.getSteuer();
                    vorherigeSteuerTabelleZeile[0] = steuerTabelleZeile;
                    return einkommen - steuerZuBezahlen;
                })
                .findFirst().get();      //lub: collect(Collectors.toList()).get(0);
*/
        int index = 0;
        for (SteuerTabelleZeile iter : steuerTabelleListe) {
            if (iter.getEinkommen() >= einkommen) {
                int steuerZuBezahlen = steuerTabelleListe.get(index - 1).getSteuer();
                return einkommen - steuerZuBezahlen;
            }
            index++;
        }
        return 0;
    }
}
