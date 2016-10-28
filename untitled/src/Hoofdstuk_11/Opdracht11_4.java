package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 30; teller++) {
            y += 3;
            g.drawString("" + teller, 50, y);
            teller++;
        }
    }
}
