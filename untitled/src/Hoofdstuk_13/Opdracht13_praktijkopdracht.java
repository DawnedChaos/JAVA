package Hoofdstuk_13;

import java.awt.*;
import java.applet.*;

//Gemaakt door Jordy Olie.
//Twee boomgaarden.
//1 met lange stammen.
//1 met korte stammen.

public class Opdracht13_praktijkopdracht extends Applet {
    int a = 100;

    public void init() {
        //Grootte van de venster.
        setSize(800, 200);
    }

    public void tekenboom( Graphics g, int x1, int y1, int x2, int y2) {
        //Kleuren en grootte van de bomen.
        g.setColor(Color.orange);
        g.fillRect(x1, y1, 20, 60);
        g.setColor(Color.green);
        g.fillOval(x2, y2, 60, 60);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < 5; teller++) {
            a += 45;
            //g = Graphics g.
            //Eerste boomgaard.
            tekenboom(g,a,100,a - 20,60);
            //Tweede boomgaard.
            tekenboom(g,a,260,a - 20,250);

        }
    }
}

