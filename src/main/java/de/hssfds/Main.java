package de.hssfds;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Kunde peter_muller = new Kunde();
        Kunde uwe_muller = new Kunde();
        Kunde luise_muller = new Kunde();

        ArrayList<Kunde> dieKlasse2 = new ArrayList<>();
        dieKlasse2.add(peter_muller);
        dieKlasse2.add(uwe_muller);
        dieKlasse2.add(luise_muller);


        System.out.println("Kundenzähler ist: " + Kunde.getKundenZaehler());

    }
}
