package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

//maak 100 cirkels om elkaar heen
public class Opdracht11_8 extends Applet{

    public void init() {}
    int teller;
    int x;
    int y;

    public void paint(Graphics g) {
        super.paint(g);
        while(teller <100){
            x+=-4;
            y+=8;
            g.drawOval(100+x,100+x,10+y,10+y);
            teller++;
        }
    }
}


