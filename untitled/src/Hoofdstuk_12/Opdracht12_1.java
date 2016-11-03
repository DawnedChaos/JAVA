package Hoofdstuk_12;

//Maak een applet in Java waarin een tabel van 10 getallen staan. Bereken het gemiddelde en zet de tien elementen en het gemiddelde op het scherm.

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht12_1 extends  Applet{
    double getal[];

    public void init(){
        getal = new double[10];
        getal[1] = 1;
        getal[2] = 2;
        getal[3] = 3;
        getal[4] = 4;
        getal[5] = 5;
        getal[6] = 6;
        getal[7] = 7;
        getal[8] = 8;
        getal[9] = 9;
        getal[10] = 10;

        for (int teller = 0; teller< getal.length; teller++){
            getal[teller] = 100 + teller * teller + 100;
        }
    }


    public void paint(Graphics g){
        for (int teller = 0; teller < getal.length; teller++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
        }
    }
}

