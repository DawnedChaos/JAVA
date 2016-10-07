package Hoofdstuk_10;














import javafx.scene.control.*;

import java.awt.*;
import java.applet.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht10_5 extends Applet{

    TextField tekstveld;
    Button knop;
    double invoer;
    double totaal;
    double gemiddelde;
    int aantalCijfers;
    boolean geklikt;


    @Override
    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add(tekstveld);

        knop = new Button("Ok");
        add(knop);
        Knoplisterner kl = new Knoplisterner();
        knop.addActionListener(kl);

    }

    public void paint(Graphics g) {
        super.paint(g);
        int x=50;
        int y=80;
        if(geklikt){


            if ( invoer < 5.5){
                g.drawString("het cijver is onvoldoende" , x, y);


            }
            else {

                g.drawString("het cijver is voldoende" , x, y);
            }




            y=y +20;
            g.drawString("gemiddelde"+ gemiddelde , x, y);
        }

    }



    class Knoplisterner implements ActionListener{


        public void actionPerformed(ActionEvent e){
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            totaal=totaal+ invoer;
            aantalCijfers++;

            gemiddelde=+totaal/aantalCijfers;

            geklikt= true;




            repaint();


        }



    }








}
