import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Szachy.*;
/**
 * Created by mariusz on 2017-02-11.
 */
public class Szachy {
    private Plansza plansza;
    private Gracz g1;
    private Gracz g2;
    private Gracz zwyciezca = null;

    public ArrayList<ArrayList<Ruch>> zbiorWszystkichRuchow = new ArrayList<ArrayList<Ruch>>();

    public void dodajDoZbioruWszystkichRuchow(ArrayList<Ruch> lista) { //throws PustaListaRuchowError {
        zbiorWszystkichRuchow.add(lista);
    }

    Szachy(Plansza p, Gracz g1, Gracz g2) {
        this.plansza = p;
        this.g1 = g1;
        this.g2 = g2;
        System.out.println("\n\n\nNOWA GRA!");
        System.out.println("\nZagrają: " + g1.toString() + " (" + g1.getKolor() + ") oraz " + g2.toString() + " (" + g2.getKolor() + ")");
    }


    private boolean czyKoniec() {
        Object obj = new Object();
        for (Object o : plansza.getZbiteFigury()) {
            if (o instanceof Krol) {
                if(((Krol) o).getGracz() == g1){
                    zwyciezca = g2;
                } else {
                    zwyciezca = g1;
                }
                return true;
            }
        }
        return false;
    }

    public void wyswietlKoniec(int licznikTury) {
        int lt = licznikTury - 1;
        System.out.println("\n\n\n KONIEC! \n\n Laczna liczba ruchow: " + lt + "\n\n\n");
        if (this.zwyciezca != null){
            System.out.println("\nOto zwyciezca: " + this.zwyciezca.toString() + "!");
        }
    }

    public boolean nastepnaKolejka(Gracz gracz, int licznik) {
        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                Figura f = plansza.getKonkretnePole(x, y).getFiguraNaPolu();
                ArrayList<Ruch> lista;

                if (f == null) {
                    continue;
                }

                if (f.getGracz().equals(gracz)) {
                    lista = f.znajdzWszystkieMozliweRuchy(plansza);
                    dodajDoZbioruWszystkichRuchow(lista);
                }
            }
        }


        Ruch wybranyRuch;
        try {
            wybranyRuch = gracz.wybierzRuch(zbiorWszystkichRuchow);
        } catch (PustaListaRuchowError plre) {
            return false;
        }

        System.out.println("Ruch " + licznik);
        System.out.println(wybranyRuch.toString(plansza));
        wybranyRuch.wykonajRuch(plansza);
        this.zbiorWszystkichRuchow.clear();
        return true;
    }


    public static void main(String[] args) {

        class naZmiane {
            private int i = -1;
            private Map<Integer, Gracz> coNaZmiane = new HashMap<>();       // dlaczego nie moze byc Object

            naZmiane(Gracz o1, Gracz o2){         // dlaczego nie moze byc Object
                coNaZmiane.put(1, o1);
                coNaZmiane.put(-1, o2);
            }

            public Gracz next() {              // dlaczego nie moze byc Object
                this.i = this.i * -1;
                return coNaZmiane.get(i);
            }

        }
        Gracz GraczBiale = new GraczLosowy("CPU1-Losowy", "gora", "białe");
        Gracz GraczCzarne = new GraczDrapiezny("CPU2-Drapiezny", "dol", "czarne");
        Plansza plansza = new Plansza(GraczBiale, GraczCzarne, "Grawszachy");
        Szachy szachy = new Szachy(plansza, GraczBiale, GraczCzarne);

        int licznikTury = 1;
        int limitRuchow = 100;  // każdy gracz po 50

        Gracz ktoryGracz;
        naZmiane graczenaZmiane = new naZmiane(GraczBiale,GraczCzarne);

        plansza.rysujPlansze();     // poczatkowy stan

        while (licznikTury <= limitRuchow) {
            ktoryGracz = graczenaZmiane.next();
            System.out.println("\n\n");
            if (szachy.czyKoniec()){
                szachy.wyswietlKoniec(licznikTury);
                return;
            }
            if (!szachy.nastepnaKolejka(ktoryGracz, licznikTury)) {          //if(!szachy.czyKoniec() || !szachy.nastepnaKolejka(GraczBiale) - REMIS!!
                System.out.println("\n\nREMIS !!!");
                szachy.wyswietlKoniec(licznikTury);
                return;
            } else {
                licznikTury++;
            }
            plansza.rysujPlansze();
            System.out.println("\nZbite figury: " + plansza.getZbiteFigury().toString() + "\n\n");

        }
        System.out.println("\n\n REMIS !!! licznikTury = " + licznikTury + " ruchów, podczas gdy limitRuchow = "  + limitRuchow + "!");
        szachy.wyswietlKoniec(licznikTury);

    }
}



