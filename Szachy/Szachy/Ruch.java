package Szachy;

import java.util.HashMap;

/**
 * Created by mariusz on 2017-02-13.
 */
public class Ruch {
    private int pozX;
    private int pozY;
    private int celX;
    private int celY;

    private int ocena;

    private static HashMap<Integer, String> mapaLiterNotacja = new HashMap<>();
    private static HashMap<Integer, Integer> mapaCyfrNotacja = new HashMap<>();

    public int getOcena(){
        return ocena;
    }

    static {
        mapaLiterNotacja.put(7, "H");
        mapaLiterNotacja.put(6, "G");
        mapaLiterNotacja.put(5, "F");
        mapaLiterNotacja.put(4, "E");
        mapaLiterNotacja.put(3, "D");
        mapaLiterNotacja.put(2, "C");
        mapaLiterNotacja.put(1, "B");
        mapaLiterNotacja.put(0, "A");

        mapaCyfrNotacja.put(7, 1);
        mapaCyfrNotacja.put(6, 2);
        mapaCyfrNotacja.put(5, 3);
        mapaCyfrNotacja.put(4, 4);
        mapaCyfrNotacja.put(3, 5);
        mapaCyfrNotacja.put(2, 6);
        mapaCyfrNotacja.put(1, 7);
        mapaCyfrNotacja.put(0, 8);

    }
    Ruch(){
        this.ocena = 0;
    }
    Ruch(int pozX, int pozY, int celX, int celY, Plansza p){
        this.pozX = pozX;
        this.pozY = pozY;
        this.celX = celX;
        this.celY = celY;
        if(p.getKonkretnePole(celX,celY).getFiguraNaPolu() != null) {
            //System.out.println("p.getKonkretnePole(celX,celY).getFiguraNaPolu() == " + p.getKonkretnePole(celX,celY).getFiguraNaPolu().toString());
            this.ocena = p.getKonkretnePole(celX, celY).getFiguraNaPolu().getWartoscFigury();
        }
    }

    private String nazwaPola(int x, int y){
        String litera = mapaLiterNotacja.get(x) + mapaCyfrNotacja.get(y);
        return litera;
    }

    public String toString(Plansza p) {
        Pole skad = p.getKonkretnePole(this.pozX, this.pozY);

        return "*** Ruch: ( " + skad.getFiguraNaPolu().toString() + " ) z " + nazwaPola(this.pozY, this.pozX) + " na " +
                nazwaPola(this.celY, this.celX) + " ***\n";
    }

    public void wykonajRuch(Plansza p){
        Figura nadchodzaca = p.getKonkretnePole(pozX, pozY).getFiguraNaPolu();
        if (nadchodzaca instanceof Pionek){
            ((Pionek) nadchodzaca).setCzyPierwszyRuchFlag(false);
        }
        if (p.getKonkretnePole(celX, celY).getFiguraNaPolu() != null) {
            Figura zbita = p.getKonkretnePole(celX, celY).getFiguraNaPolu();
            p.zbiteFigury.add(zbita);
            System.out.println("ZBITO FIGURĘ!!! : " + p.getKonkretnePole(celX, celY).getFiguraNaPolu().toString());
        }

        p.getKonkretnePole(pozX, pozY).setFiguraNaPolu(null);
        p.getKonkretnePole(pozX, pozY).setFlagaPola("");//\u001B[31m");       //"\u001B[41m" // w konsoli nie bedzie dzialalo
        p.getKonkretnePole(celX, celY).setFiguraNaPolu(nadchodzaca);
        p.getKonkretnePole(celX, celY).setFlagaPola("");                      //"\u001B[31m"  // w konsoli nie bedzie dzialalo.
        nadchodzaca.setPozX(celX);
        nadchodzaca.setPozY(celY);



    }
}
