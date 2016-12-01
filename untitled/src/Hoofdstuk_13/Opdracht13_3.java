package Hoofdstuk_13;

//Gemaakt door Jordy Olie.
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht13_3 extends Applet{
    //Grootte venster
    public void init() {
        setSize(400, 400);
    }

        public void paint(Graphics g){
            int x = 50;
            int y = 50;
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 40; j++) {
                        g.setColor(Color.red);
                        g.fillRect(x, y, 40, 30);
                        g.setColor(Color.black);
                        g.drawRect(x, y, 40, 30);
                        x += 40;
                    }
                    y += 30;
                    x = 50;
        }
    }
}
