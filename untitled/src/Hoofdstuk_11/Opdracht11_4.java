package Hoofdstuk_11;

        import java.awt.*;
        import java.applet.*;

//Tafel van drie
public class Opdracht11_4 extends Applet{

    public void init() {}
    int teller;
    int x;
    int y;

    public void paint(Graphics g) {
        super.paint(g);


        while(teller <10){
            x+=3;
            y+=20;
            g.drawString(""+x, 50, y);
            teller++;
        }
    }
}
