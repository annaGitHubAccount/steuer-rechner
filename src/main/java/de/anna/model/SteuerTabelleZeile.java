package de.anna.model;

public class SteuerTabelleZeile {

    private int einkommen;
    private int steuer;

    public SteuerTabelleZeile(int einkommen, int steuer) {
        this.einkommen = einkommen;
        this.steuer = steuer;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public int getSteuer() {
        return steuer;
    }

    public void setSteuer(int steuer) {
        this.steuer = steuer;
    }
}
