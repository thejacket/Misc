package Szachy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mariusz on 2017-01-21.
 */
public class Plansza {


    private Pole[][] Szachownica = new Pole[8][8];       // [rzad][kolumna]

    public List<Figura> zbiteFigury = new ArrayList<>();

    public Plansza(Gracz g1, Gracz g2, String schemat) {

        GeneratorKolorowPol generatorKolorow = new GeneratorKolorowPol();

        if (schemat == "Grawszachy") {

            Szachownica[0][0] = new Pole(generatorKolorow.next(), new Wieza(g1, 0, 0));
            Szachownica[0][1] = new Pole(generatorKolorow.next(), new Skoczek(g1, 0, 1));
            Szachownica[0][2] = new Pole(generatorKolorow.next(), new Goniec(g1, 0, 2));
            Szachownica[0][3] = new Pole(generatorKolorow.next(), new Krol(g1, 0, 3));
            Szachownica[0][4] = new Pole(generatorKolorow.next(), new Hetman(g1, 0, 4));
            Szachownica[0][5] = new Pole(generatorKolorow.next(), new Goniec(g1, 0, 5));
            Szachownica[0][6] = new Pole(generatorKolorow.next(), new Skoczek(g1, 0, 6));
            Szachownica[0][7] = new Pole(generatorKolorow.next(), new Wieza(g1, 0, 7));

            for (int i = 0; i <= 7; i++) {
                Szachownica[1][i] = new Pole(generatorKolorow.next(), new Pionek(g1, 1, i));
            }

            for (int i = 2; i <= 5; i++) {
                for (int z = 0; z <= 7; z++) {
                    Szachownica[i][z] = new Pole(generatorKolorow.next(), null);
                }
            }

            for (int i = 0; i <= 7; i++) {
                Szachownica[6][i] = new Pole(generatorKolorow.next(), new Pionek(g2, 6, i));
            }

            Szachownica[7][0] = new Pole(generatorKolorow.next(), new Wieza(g2, 7, 0));
            Szachownica[7][1] = new Pole(generatorKolorow.next(), new Skoczek(g2, 7, 1));
            Szachownica[7][2] = new Pole(generatorKolorow.next(), new Goniec(g2, 7, 2));
            Szachownica[7][3] = new Pole(generatorKolorow.next(), new Hetman(g2, 7, 3));
            Szachownica[7][4] = new Pole(generatorKolorow.next(), new Krol(g2, 7, 4));
            Szachownica[7][5] = new Pole(generatorKolorow.next(), new Goniec(g2, 7, 5));
            Szachownica[7][6] = new Pole(generatorKolorow.next(), new Skoczek(g2, 7, 6));
            Szachownica[7][7] = new Pole(generatorKolorow.next(), new Wieza(g2, 7, 7));

        }
        else if (schemat == "pustaplansza"){
            for (int i = 0; i <= 7; i++) {
                for (int z = 0; z <= 7; z++) {
                    Szachownica[i][z] = new Pole(generatorKolorow.next(), null);
                }
            }
        }
    }

    public Pole[][] getSzachownica() {
        return Szachownica;
    }

    public Pole getKonkretnePole(int x, int y) {
        return Szachownica[x][y];
    }


    public List<Figura> getZbiteFigury() {
        return zbiteFigury;
    }

    public void rysujPlansze(){
        System.out.println();
        for (int i = 0; i <= 7; i++) {
            for (int z = 0; z <= 7; z++) {
                Szachownica[i][z].rysujPole();
            }
            System.out.println();
        }

    }

















    /*
    Plansza(int wymiar){                    // plansza kwadratowa
        for(int x = 0; x < wymiar; x++){
            for (int y = 0; y < wymiar; y++){
                macierzPlanszy[x][y] = new Pole(x, y, zas);
            }
        }
    }

    Plansza(int szerokosc, int dlugosc){      // plansza 2 wymiarowa o rozmiarze wymiarX:wymiarY
        for(int x = 0; x < szerokosc; x++){
            for (int y = 0; y < dlugosc; y++){
                macierzPlanszy[x][y] = new Pole(x, y, zas);
            }
        }
    }
    }
    */
}
