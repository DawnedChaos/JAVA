package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


//Maak vijf cirkels om elkaar heen.

public class Opdracht11_6 extends Applet{

    public void init() {}

        public void paint(Graphics g) {
            g.drawOval(100,100,10,10);
            g.drawOval(98,98,14,14);
            g.drawOval(96,96,18,18);
            g.drawOval(94,94,22,22);
            g.drawOval(92,92,26,26);

    }
}
