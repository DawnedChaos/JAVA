package Hoofdstuk_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdracht12_3 extends Applet{

    TextField[] textFields;
    int[] getallen;
    Button knop;

    @Override
    public void init() {

        textFields = new TextField[5];
        getallen = new int[5];
        knop = new Button("Klik");
//        textFields[0] = new TextField("", 7);
//        add(textFields[0]);
//        textFields[1] = new TextField("", 7);
//        add(textFields[1]);
//        textFields[2] = new TextField("", 7);
//        add(textFields[2]);
//        textFields[3] = new TextField("", 7);
//        add(textFields[3]);
//        textFields[4] = new TextField("", 7);
//        add(textFields[4]);

        for (int i = 0; i < textFields.length; i++){
            textFields[i] = new TextField("", 7);
            add(textFields[i]);
        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
//            String s = textFields[0].getText();
//            int i = Integer.parseInt(s);
//            getallen[0] = i;
//            String s1 = textFields[1].getText();
//            int i2 = Integer.parseInt(s1);
//            getallen[1] = i2;
//            String s2 = textFields[2].getText();
//            int i3 = Integer.parseInt(s2);
//            getallen[2] = i3;
//            String s3 = textFields[3].getText();
//            int i4 = Integer.parseInt(s3);
//            getallen[3] = i4;
//            String s4 = textFields[4].getText();
//            int i5 = Integer.parseInt(s4);
//            getallen[4] = i5;
            for (int j = 0; j < getallen.length; j++){
//                String s = textFields[j].getText();
//                int getal = Integer.parseInt(s);
                getallen[j] = Integer.parseInt(textFields[j].getText());
            }
            Arrays.sort(getallen);

            for (int i = 0; i < textFields.length; i++){
                textFields[i].setText("" + getallen[i]);
            }

        }
    }
}
