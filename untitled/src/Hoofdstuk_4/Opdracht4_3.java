package Hoofdstuk_4;

        import java.awt.*;
        import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
    }


    public void paint(Graphics g)
    {   setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(50, 100, 240, 20);
        g.setColor(Color.blue);
        g.fillRect(50, 150, 240, 20);
        g.setColor(Color.black);
        g.drawLine(50, 320, 49, 120);


    }

}