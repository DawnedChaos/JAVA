package Hoofdstuk_4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground (Color.white);
        g.setColor(Color.black);
        //draw dak
        g.drawLine(80, 100, 320, 100);
        g.drawLine(80, 100, 200, 40);
        g.drawLine(200, 40, 320, 100);
        //draw huis
        g.drawRect(100, 100, 200, 100);
        //draw deur
        g.drawRect(180, 130, 40, 70);
        //draw raam
        g.drawRect(120, 130, 40, 40);
    }
}