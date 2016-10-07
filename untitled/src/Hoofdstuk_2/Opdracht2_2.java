package Hoofdstuk_2;

import java.awt.*;
import java.applet.*;

public class Opdracht2_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Jordy", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Olie", 50, 70);
    }
}