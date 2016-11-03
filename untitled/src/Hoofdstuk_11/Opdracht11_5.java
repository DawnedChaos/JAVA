package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

//vijf vierkantjes
public class Opdracht11_5 extends Applet{

    public void init(){}
        int teller;
        int x;
        int y;

        public void paint(Graphics g){
            super.paint(g);

                while(teller <5){
                    x+=20;
                    y+=20;
                    g.drawRect(50+x, 25+y, 20, 20);
                    teller++;
                }
            }
}
