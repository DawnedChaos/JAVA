package Hoofdstuk_2;

import java.awt.*;
import java.applet.*;

public class Opdracht2_1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("jordy olie!!", 50, 60 );
    }
}