package Hoofdstuk_4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(80, 100, 320, 100);
        g.drawLine(80, 100, 200, 40);
        g.drawLine(200, 40, 320, 100);
    }
}