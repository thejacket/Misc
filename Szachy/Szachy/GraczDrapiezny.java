package Szachy;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mariusz on 2017-02-28.
 */
public class GraczDrapiezny extends Gracz {
    public GraczDrapiezny(String nazwa, String goraCzyDol, String kolor) {
        super(nazwa, goraCzyDol, kolor);
    }

    @Override
    public Ruch wybierzRuch(ArrayList<ArrayList<Ruch>> listaRuchow) throws PustaListaRuchowError {
        ArrayList<Ruch> listaRuchowZRownaOcena = new ArrayList<>();

            for (ArrayList<Ruch> ruchyJednejFigury: listaRuchow) {
                for (Ruch r : ruchyJednejFigury) {
                    if (listaRuchowZRownaOcena.isEmpty() || (r.getOcena() > listaRuchowZRownaOcena.get(0).getOcena())) {
                        // listaRuchowZRownaOcena.get(0) - wykorzystuję fakt, ze na liscie wszystkie ruchy beda mialy rowna ocene
                        listaRuchowZRownaOcena.clear();
                        listaRuchowZRownaOcena.add(r);
                    } else if (r.getOcena() == listaRuchowZRownaOcena.get(0).getOcena()) {
                        listaRuchowZRownaOcena.add(r);

                    }


                }
            }
        return listaRuchowZRownaOcena.get(new Random().nextInt(listaRuchowZRownaOcena.size()));
    }

}
