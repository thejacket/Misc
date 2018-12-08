package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-11.
 */
public abstract class Gracz extends Object {

    private String nazwa;
    private String goraCzyDol;
    private String kolor;

    Gracz(String nazwa, String goraCzyDol, String kolor){
        this.nazwa = nazwa;
        this.goraCzyDol = goraCzyDol;
        this.kolor = kolor;
    }


    public String toString() {
        return nazwa;
    }
    public String getGoraCzyDol(){
        return goraCzyDol;
    }
    public String getKolor(){
        return kolor;
    }
    public abstract Ruch wybierzRuch(ArrayList<ArrayList<Ruch>> listaRuchow) throws PustaListaRuchowError;

}
