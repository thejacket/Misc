package Szachy;

/**
 * Created by mariusz on 2017-01-21.
 */
public class Plansza {
    private Pole[][] macierzPlanszy;

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
}
