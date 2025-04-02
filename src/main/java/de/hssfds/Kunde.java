package de.hssfds;

public class Kunde {

    private String vorname;
    private String nachname;
    private int kundennummer;

    private static int kundenZaehler;


    public Kunde() {

        kundenZaehler++;

    }

    public static int getKundenZaehler() {

        return kundenZaehler;
    }

}
