package Hoofdstuk_13;

//Gemaakt door Jordy Olie.
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht13_2 extends Applet {
    //Grootte venster
    public void init() {
        setSize(400, 400);
    }
    //Declaratie methode voor de driehoek.
    public void paint(Graphics g) {
        tekenDriehoek(g, 300, 350, 15, 200, 250, 15);
    }

    //Meetlat argumenten coordinaten.
    //x1 = 300
    //y1 = 350
    //x2 = 15
    //y2 = 200
    //x3 = 250
    //y3 = 15

    //Methode voor driehoek, is gegeven in de opdracht.
    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        //onderste lijn.
        g.drawLine(x1, y1, x2, y2);
        //rechter lijn.
        g.drawLine(x3, y3, x1, y1);
        //linker lijn.
        g.drawLine(x2, y2, x3, y3);
 }
}
