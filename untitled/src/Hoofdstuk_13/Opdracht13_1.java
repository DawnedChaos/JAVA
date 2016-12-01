package Hoofdstuk_13;

//Gemaakt door Jordy Olie.
import java.awt.*;
import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.awt.Color.black;

public class Opdracht13_1 extends Applet{
    //Declaratie buttons.
    Button rood;
    Button geel;
    Button blauw;
    Button wit;
    Button groen;

    public void init(){
        //Grootte venster.
        setSize(400,400);
        //Knop voor rode achtergrond.
        rood = new Button ("Rode achtergrond");
        KnopListener kl = new KnopListener();
        rood.addActionListener( kl );
        add(rood);
        //Knop voor gele achtergrond.
        geel = new Button ("Gele achtergrond");
        KnopListener2 cs = new KnopListener2();
        geel.addActionListener( cs );
        add(geel);
        //Knop voor blauwe achtergrond.
        blauw = new Button ("Blauwe achtergrond");
        KnopListener3 ab = new KnopListener3();
        blauw.addActionListener( ab );
        add(blauw);
        //Knop voor witte achtergrond.
        wit = new Button ("Witte achtergrond");
        KnopListener4 cd = new KnopListener4();
        wit.addActionListener( cd );
        add(wit);
        //Knop voor groene achtergrond.
        groen = new Button ("Groene achtergrond");
        KnopListener5 xy = new KnopListener5();
        groen.addActionListener( xy );
        add(groen);
    }

    public void paint(Graphics g){
    }

    //KnopListener rode achtergond.
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            setBackground(Color.red);
            getGraphics().setColor(black);
            getGraphics().drawString("Rood",50, 100);
        }
    }
    //KnopListener gele achtergrond.
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e){
            setBackground(Color.yellow);
            getGraphics().setColor(black);
            getGraphics().drawString("Geel",50, 100);
        }
    }
    //KnopListener blauwe achtergrond.
    class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e){
            setBackground(Color.blue);
            getGraphics().setColor(black);
            getGraphics().drawString("Blauw",50, 100);
        }
    }
    //KnopListener witte achtergrond.
    class KnopListener4 implements ActionListener {
        public void actionPerformed( ActionEvent e){
            setBackground(Color.white);
            getGraphics().setColor(black);
            getGraphics().drawString("Wit",50, 100);
        }
    }
    //KnopListener groene achtergrond.
    class KnopListener5 implements ActionListener {
        public void actionPerformed( ActionEvent e){
            setBackground(Color.green);
            getGraphics().setColor(black);
            getGraphics().drawString("Groen",50, 100);
        }
    }
}
