package de.anna.data;

import de.anna.model.SteuerTabelleZeile;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private final static List<SteuerTabelleZeile> STEUER_TABELLE = new ArrayList<>();

    public List<SteuerTabelleZeile> getSteuerTabelle() {

        STEUER_TABELLE.add(new SteuerTabelleZeile(0, 100));
        STEUER_TABELLE.add(new SteuerTabelleZeile(5000, 1000));
        STEUER_TABELLE.add(new SteuerTabelleZeile(6000, 1100));
        STEUER_TABELLE.add(new SteuerTabelleZeile(7000, 1200));
        STEUER_TABELLE.add(new SteuerTabelleZeile(8000, 1300));
        STEUER_TABELLE.add(new SteuerTabelleZeile(9000, 1400));
        STEUER_TABELLE.add(new SteuerTabelleZeile(10000, 1500));
        STEUER_TABELLE.add(new SteuerTabelleZeile(11000, 1600));
        STEUER_TABELLE.add(new SteuerTabelleZeile(12000, 1700));
        STEUER_TABELLE.add(new SteuerTabelleZeile(13000, 1800));
        return STEUER_TABELLE;
    }
}
