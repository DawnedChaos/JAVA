package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


//Maak vijftig cirkels om elkaar heen.

public class Opdracht11_7 extends Applet{

    public void init() {}
    int teller;
    int x;
    int y;

    public void paint(Graphics g) {
        super.paint(g);
        while(teller <50){
            x+=-4;
            y+=8;
            g.drawOval(160+x,160+x,10+y,10+y);
            teller++;
        }
    }
}
