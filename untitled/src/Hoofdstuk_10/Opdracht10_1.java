package Hoofdstuk_10;



        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;

//opdracht 10.1
public class Opdracht10_1 extends Applet {


    TextField tekstvak1, tekstvak2;
    int cijfer1, cijfer2;
    Label label;
    String s, a, tekst;

    public void init() {
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        label = new Label("Tik 2 getallen in");
        tekstvak1.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekst = "";

        add(label);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            cijfer1 = Integer.parseInt(s);
            a = tekstvak2.getText();
            cijfer2 = Integer.parseInt(a);
            if (cijfer1 > cijfer2) {
                tekst = cijfer1 + " is groter dan " + cijfer2;
            } else {
                tekst = cijfer2 + " is groter dan " + cijfer1;
            }


        }
    }
}
