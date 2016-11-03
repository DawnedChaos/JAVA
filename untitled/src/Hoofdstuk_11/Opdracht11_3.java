package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

//De rij van Fibonacci.
//Dit legt uit wat de rij van Fibonacci is: https://nl.wikipedia.org/wiki/Rij_van_Fibonacci
//De nummers bestaan uit:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, etc:



public class Opdracht11_3 extends Applet {

        public void init(){}
        int teller=0;
        int x;
        int y;

    public void paint(Graphics g) {
            super.paint(g);

            while(teller <5){
                x+=2;
                y+=20;
                g.drawString(""+01+x,50,y);
                teller++;
            }
        }
}




