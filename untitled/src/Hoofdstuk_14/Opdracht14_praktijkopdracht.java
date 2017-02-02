package Hoofdstuk_14;

    import java.applet.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.Random;
    import java.net.*;

    //Hoofdstuk 14
    //Praktijkopdracht
    //Door Jordy Olie
    //MMVAOO6C

    //Dit is een spel waarbij de speler het tegen de computer opneemt.
    //Je begint met 23 smileys.
    //De speler begint met een getal tussen 1 en 3 om smileys van het speelveld weg te nemen.
    //De computer neemt ook een getal tussen 1 en 3 om smileys van het speelveld weg te nemen.
    //Dit gaat door tot er geen smileys meer zijn.
    //Als de speler de laatste smiley weg neemt dan heeft de computer gewonnen.
    //Als de computer de laatste smiley weg neemt dan heeft de speler gewonnen.

    //Dit spel is makkelijk te winnen als je de volgorde van 21, 17, 13, 9, 5 en 1 volgt.


    public class Opdracht14_praktijkopdracht extends Applet {

        //Knoppen voor reset/opnieuw en voor de ok/antwoord.
        Button opnieuw;
        Button okknop;

        //TextFields voor de getal dat de speler wilt invoeren.
        TextField nummergetal;

        //Ints
        //23 voor elke keer dat het spel word gereset.
        int getal = 23;
        //23 voor elke keer dat het spel wordt opgestart.
        int spel = 23;
        //
        int nummer1;
        //
        int nummer2;

        //Booleans
        boolean click = false;
        boolean gewonnen = false;
        boolean verloren = false;
        boolean game = false;
        boolean win = false;
        boolean keuze = false;

        //Plaatjes
        Image evilface, happyface, neutralface, sadface;
        URL pad;


        public void init() {
            setSize(700,600);
            //Knoppen
            opnieuw = new Button("Reset");
            opnieuw.addActionListener(new opnieuw());
            okknop = new Button("Ok");
            okknop.addActionListener(new Update());

            //Textfield
            nummergetal = new TextField("", 5);
            nummergetal.addActionListener(new Update());

            //Add knoppen en textfields
            add(opnieuw);
            add(okknop);
            add(nummergetal);

            //Pad voor de plaatjes
            pad = Opdracht14_praktijkopdracht.class.getResource("/resources/");

            //plaatjes
            evilface = getImage(pad, "Evilface.png");
            sadface = getImage(pad, "Sadface.png");
            happyface = getImage(pad, "Happyface.png");
            neutralface = getImage(pad, "Neutralface.png");
        }

        //reset knop : druk de reset knop om het spel te beginnen.
        public class opnieuw implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                spel = 23;
                verloren = false;
                gewonnen = false;
                game = true;
                win = false;
                keuze = true;
                repaint();
            }
        }

        public class Update implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                updateSpel();
            }
        }

        public void updateSpel() {
            int invoergetal = 0;

            if (keuze) {
                invoergetal = Integer.valueOf(nummergetal.getText());
            }nummergetal.setText("");

            if (invoergetal > 0 && invoergetal < 4 && spel > 0 && spel >= invoergetal) {
                spel -= invoergetal;
                nummer2 = invoergetal;
                nummer1 = 69;
                click = true;

                    if (spel != 21 && spel > 20) {
                        int hulp = spel - 21;
                        spel -= hulp;
                        win = true;
                        } else
                            if (spel != 17 && spel > 16 && spel < 21) {
                                int hulp = spel - 17;
                                spel -= hulp;
                                win = true;
                            } else
                                if (spel != 13 && spel > 12 && spel < 17) {
                                    int hulp = spel - 13;
                                    spel -= hulp;
                                    win = true;
                                } else
                                    if (spel != 9 && spel > 8 && spel < 13) {
                                        int hulp = spel - 9;
                                        spel -= hulp;
                                    } else
                                        if (spel != 5 && spel > 4 && spel < 9) {
                                            int hulp = spel - 5;
                                            spel -= hulp;
                                            win = true;
                                        } else
                                            if (spel != 1 && spel > 0 && spel < 5) {
                                            int hulp = spel - 1;
                                            spel -= hulp;
                                            win = true;
                                            } else {
                                                int random = new Random().nextInt(3) + 1;
                                                spel -= random;
                                                getal = random;
                                                nummer1 = getal;
                                                nummer2 = 69;
                                                repaint();
                                            }

                if (spel <= nummer2 && nummer1 == 69) {
                    click = false;
                    game = false;
                    gewonnen = false;
                    verloren = true;
                    keuze = false;
                    }

                if (spel <= nummer1 && nummer2 == 69) {
                    click = false;
                    game = false;
                    gewonnen = true;
                    verloren = false;
                    keuze = false;
                    }
                }
            repaint();
        }

            public void paint(Graphics g) {
                int x = 50;
                int y = 50;
                g.drawString("Druk op de reset knop om te beginnen.", 30, 30);
                if (game) {
                    if (click) {
                        g.drawString("De computer pakt: " + getal + " smileys", x, y);
                        y += 25;
                        }
                    g.drawString("Aantal Smileys: " + spel, x, y);
                }

                //x2 en y2 zijn voor de plaatjes.
                int x2 = 50;
                int y2 = 35;

                for (int i = 0; i < spel; i++) {
                     if (i % 4 == 0) {
                        x2 = 50;
                        y2 += 50;
                     }
                     if (win) {
                        g.drawImage(neutralface, x2, y2, 40, 40, this);
                    } else {
                        g.drawImage(happyface, x2, y2, 40, 40, this);
                    }
                    x2 += 50;
                }

                //Als je wint
                if (gewonnen) {
                    g.drawString("Hmmm... je hebt gewonnen.", 50, 50);
                    g.drawImage(sadface, 50, 60, 300, 200, this);
                }

                //Als je verliest
                if (verloren) {
                    g.drawString("Ha!!! Je hebt verloren.", 50, 50);
                    g.drawImage(evilface, 50, 60, 200, 200, this);
                    }
            }
    }
