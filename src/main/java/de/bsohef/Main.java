package de.bsohef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben sie an, wie voll ihr Tank ist: ");
        double tankinhalt = eingabe.nextDouble();

        System.out.println("Bitte geben sie an, wie viel sie pro 100 Kilometer verbrauchen: ");
        double verbrauch = eingabe.nextDouble();

        System.out.println("Bitte geben sie an, wievile Kilometer sie fahren wollen: ");
        double distanz = eingabe.nextDouble();

        System.out.println("Bitte geben sie den Preis pro Liter Benzin an: ");
        double preis = eingabe.nextDouble();



    }
}
