package Hoofdstuk_14;

    import java.awt.*;
    import java.applet.*;
    import java.awt.Button;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Random;

    //Hoofdstuk 14
    //Opdracht 2
    //Door Jordy Olie
    //MMVAOO6C

    public class Opdracht14_2 extends Applet {

        //Vormen.
        String[] kleuren = {"Harten", "Klaver", "Ruiten", "Schoppen"};
        //Getallen.
        String[] joker = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
        //Alles bij elkaar.
        String[] jas = new String[52];
        //Alle spelers.
        private String[] speler1 = new String[13];
        private String[] speler2 = new String[13];
        private String[] speler3 = new String[13];
        private String[] speler4 = new String[13];
        //Knop.
        Button delen;
        //Deelknop.
        boolean gedeeld;

        public void init() {
            setSize(700,600);
            delen = new Button("Deel Kaarten");
            delen.addActionListener(new KaartenListener());
            add(delen);
    }

        public String deelKaart() {
            Random random = new Random();
            int rdm = random.nextInt(jas.length);
            String kaart = jas[rdm];
            String[] hulplijst = new String[jas.length - 1];
            int hulpindex = 0;
            for (int i = 0; i < jas.length; i++) {
                if (i != rdm) {
                    hulplijst[hulpindex] = jas[i];
                    hulpindex++;
                    }
                }
                jas = hulplijst;
                return kaart;
        }

        class KaartenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                gedeeld = true;
                int getal = 0;
                jas = new String[52];

            for (int i = 0; i < kleuren.length; i++) {
                String kleur = kleuren[i];

                for (int j = 0; j < joker.length; j++) {
                    String kaart = joker[j];
                    jas[getal] = kleur + " " + kaart;
                    getal++;
                }
            }

            for (int i = 0; i < 13; i++) {
                speler1[i] = deelKaart();
                speler2[i] = deelKaart();
                speler3[i] = deelKaart();
                speler4[i] = deelKaart();
            }
            repaint();
        }
    }
    @Override
    public void paint(Graphics g){
        int y = 70;

        if (gedeeld == true) {
            getGraphics().drawString("Speler 1", 100, 50);
            getGraphics().drawString("Speler 2", 200, 50);
            getGraphics().drawString("Speler 3", 300, 50);
            getGraphics().drawString("Speler 4", 400, 50);


            for (int i = 0; i < 13; i++) {
                getGraphics().drawString(speler1[i], 100, y);
                getGraphics().drawString(speler2[i], 200, y);
                getGraphics().drawString(speler3[i], 300, y);
                getGraphics().drawString(speler4[i], 400, y);
                y += 20;
            }
        }
    }
}


