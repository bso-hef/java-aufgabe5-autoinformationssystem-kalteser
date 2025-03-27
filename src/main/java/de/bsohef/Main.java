package de.bsohef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben sie an, wie voll ihr Tank ist: ");
        double tankinhalt = eingabe.nextDouble();
        if(tankinhalt == 0 )
            System.out.println("Achtung der Tank ist leer");
        if (tankinhalt < 0)
            System.out.println("Der eingegebene Tankinhalt ist flasch");

        System.out.println("Bitte geben sie an, wie viel sie pro 100 Kilometer verbrauchen: ");
        double verbrauch = eingabe.nextDouble();
        if(verbrauch > 0 );
        else
            System.out.println("Der eingegebene Verbrauch ist flasch");

        System.out.println("Bitte geben sie an, wie viel Kilometer sie fahren wollen: ");
        double distanz = eingabe.nextDouble();
        if(distanz > 0);
        else
            System.out.println("Die eingegebene Distanz ist flasch");

        System.out.println("Bitte geben sie den Preis pro Liter Benzin an: ");
        double preis = eingabe.nextDouble();
        if(preis > 0);
        else
            System.out.println("Der eingegebene Preis ist flasch");

        double resttank = tankinhalt - (verbrauch / 100 * distanz);
        double kostenfahrt = (tankinhalt - resttank) * preis;

        if(resttank < 0)
            System.out.println("Achtung der Tank wird für dir Strecke nicht reichen");
        else
            System.out.println("Der Resttank nach der Strecke beträgt " + resttank);
        System.out.println("Die Benzinkosten für die Fahrt betragen " + kostenfahrt + " €");

    }
}
