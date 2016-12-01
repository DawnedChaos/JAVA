package Hoofdstuk_12;

//Maak een applet in Java waarin een tabel van 10 getallen staan. Bereken het gemiddelde en zet de tien elementen en het gemiddelde op het scherm.

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht12_1 extends  Applet{

    double salaris[], totaalsalaris, gemiddelde;


    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 50 * teller + 50;
            totaalsalaris += salaris[teller];
        }
    }

    public void paint(Graphics g) {
        gemiddelde = totaalsalaris / salaris.length;
        g.drawString("Gemiddelde = " + gemiddelde, 50, 30);

    }
}