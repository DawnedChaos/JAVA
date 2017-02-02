package Hoofdstuk_14;

    import java.awt.*;
    import java.applet.*;
    import java.awt.Button;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Random;

        //Hoofdstuk 14
        //Opdracht 1
        //Door Jordy Olie
        //MMVAOO6C
        //Maak een knop die een kleur kiest dan een vorm en dan een aantal.
        //Gemaakt door Jordy Olie.
        //Ruiten, Schoppen, Klaver, Harten.
        //2 t/m 6 en vrouw, boer, heer en aas.

        //Reden voor namen: https://nl.wikipedia.org/wiki/Speelkaart

        public class Opdracht14_1 extends Applet {

            //De vormen (harten) zijn genoemd als kleuren omdat ze zo worden genoemd in kaartspellen.
            String[] kleuren = {"Harten", "Klaver", "Ruiten", "Schoppen"};
            //De nummers zijn genoemd als joker omdat dat de enigste is die niet voorkomt.
            String[] joker = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
            //Alle kaarten samen noem ik een jas (klaverJAS)
            String[] jas = new String[52];
            //Button
            Button delen;
            //Int voor random getal.
            int getal;
            //true or false
            boolean gedeeld;

            public void init() {
                //Knop
                delen = new Button("Deel Kaart");
                delen.addActionListener(new KaartListener());
                add(delen);
                //Loop
                int getal = 0;
                for (int i = 0; i < kleuren.length; i++) {
                    String kleur = kleuren[i];
                for (int j = 0; j < joker.length; j++) {
                    String kaart = joker[j];
                    jas[getal] = kleur + " " + kaart;
                    getal++;
                    }
                }
            }

            public void paint(Graphics g) {
                if (gedeeld == true) {
                    g.drawString(jas[getal], 50, 50);
                }
            }

            class KaartListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                //Random int
                Random random = new Random();
                int rdm = random.nextInt(52);
                getal = rdm;
                //Dit geeft aan dat de boolean true is.
                gedeeld = true;
                repaint();
                }
            }
        }







