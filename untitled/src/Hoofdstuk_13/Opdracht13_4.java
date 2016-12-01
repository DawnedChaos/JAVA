package Hoofdstuk_13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Opdracht13_4 extends Applet{
    Button rodeknop;
    Button grijzeknop;
    Color rodegrijs;
    Color streepkleur;
    int hoogte;
    int breedte;
    int verticaal;
    int horizontaal;
    boolean muurrood;
    boolean muurgrijs;

    public void init() {
        //Grootte venster.
        setSize(600, 600);
        //Rode knop.
        rodeknop = new Button("Rode bakstenen");
        KnopListenerbaksteen ab = new KnopListenerbaksteen();
        rodeknop.addActionListener(ab);

        //Grijze knop.
        grijzeknop = new Button("Grijze betonblokken");
        KnopListenerbeton xy = new KnopListenerbeton();
        grijzeknop.addActionListener(xy);

        //Kleuren.
        streepkleur = (Color.black);
        //false
        muurrood = false;
        muurgrijs = false;
        //knoppen
        repaint();
        add(rodeknop);
        add(grijzeknop);
    }
        public void paint(Graphics g) {
            int x = 50;
            int y = 50;
            if (muurrood = true) {
                for (int i = 0; i < hoogte; i++) {
                    for (int j = 0; j < breedte; j++) {
                        g.setColor(rodegrijs);
                        g.fillRect(x, y, breedte, hoogte);
                        g.setColor(streepkleur);
                        g.drawRect(x, y, breedte, hoogte);
                        x += breedte;
                    }
                    y += hoogte;
                    x = 50;
                }
            }
        }

                class KnopListenerbaksteen implements ActionListener {
                    public void actionPerformed(ActionEvent e){
                        breedte = 40;
                        hoogte = 30;
                        horizontaal = 25;
                        verticaal = 20;
                        rodegrijs = (Color.red);
                        muurrood = true;
                        repaint();
                    }
                   }
                class KnopListenerbeton implements ActionListener{
                    public void actionPerformed(ActionEvent e) {
                        breedte = 50;
                        hoogte = 40;
                        horizontaal = 35;
                        verticaal = 30;
                        rodegrijs = Color.gray;
                        muurgrijs = true;
                        repaint();
                    }
                }
            }

