package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

//20 tot 10
public class Opdracht11_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller  >9 ) {
            y += 20;
            g.drawString("" + teller, 50, y );
            teller--;
        }
    }
}
