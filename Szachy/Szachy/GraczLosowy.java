package Szachy;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mariusz on 2017-02-14.
 */
public class GraczLosowy extends Gracz {
    public GraczLosowy(String nazwa, String goraCzyDol, String kolor) {
        super(nazwa, goraCzyDol, kolor);
    }

    @Override
    public Ruch wybierzRuch(ArrayList<ArrayList<Ruch>> listaRuchow) throws PustaListaRuchowError {
        ArrayList<Ruch> listt = new ArrayList<>();

        int i = 0;

        boolean wylosowanoNiepustaListe = false;
        while(!wylosowanoNiepustaListe) {
            if (listaRuchow.isEmpty()) {
                throw new PustaListaRuchowError();
            }
            listt = listaRuchow.get(new Random().nextInt(listaRuchow.size()));
            if (!listt.isEmpty()){
                wylosowanoNiepustaListe = true;
            }
            i++;
            if (i > 5000){                      // :) problem przy testowej planszy z pionkami - dochodza do konca planszy i caly czas
                                                // przekazywana jest pusta lista ruchow - jak to rozwiazac?
                throw new PustaListaRuchowError();
            }
        }
        Ruch ktoryRuch = listt.get(new Random().nextInt(listt.size()));


        return ktoryRuch;

    }

}
