package Szachy;

import java.util.Map;

/**
 * Created by mariusz on 2017-01-21.
 */
public class Pole {
    private int wartoscPola;
    private String nazwaPola;
    private String kolor;

    Pole(int x, int y, Zasady zas){
        this.wartoscPola = this.inicjacjaPola(nazwaPola, zas);
        //this.kolor = ;
    }

    int inicjacjaPola(String nazwa_pola, Zasady zas){
        int nowaWartoscPola = zas.getMapaWartosciPoczatkowych();
        return nowaWartoscPola;
    }
}
