package Hoofdstuk_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Opdracht 10.4 = Breid de applet zo uit, dat ook het jaar ingegeven kan worden en aan de hand daarvan wordt bepaald of het om een schrikkeljaar gaat om het juiste aantal dagen voor februari te kunnen vaststellen.
public class Opdracht10_4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}