package Szachy;

/**
 * Created by mariusz on 2017-01-21.
 */
public class Pole {

    private Figura figuraNaPolu;
    private String kolorPola;   // obecnie wykomentowalem w metodzie wykonajRuch w klasie Ruch, gdyż w konsoli zamiast kolorow wyswietla sie
                                // kod ANSI zamiast kolorow; w moim IDE (intellij) dziala poprawnie i koloruje na planszy wykonany w tej turze ruch.

    private String flagaPola = null;

    Pole(String kolorPola, Figura figuraNaPolu){
        this.figuraNaPolu = figuraNaPolu;
        this.kolorPola = kolorPola; // na zmianę w czasie inicjalizacji
    }

    public void setFlagaPola(String flagaPola){
        this.flagaPola = flagaPola;
    }   // obecnie wykomentowalem

    public Figura getFiguraNaPolu() {
        return figuraNaPolu;
    }

    public String getKolorPola() {
        return kolorPola;
    }

    public void setFiguraNaPolu(Figura f) {
        this.figuraNaPolu = f;
    }

    public void rysujPole(){
        String output;
        if (figuraNaPolu != null) {

            output = figuraNaPolu.toString();

        } else {

            output = ".";

        }
        if(this.flagaPola == null){
            System.out.format("%4s", output);
        }
        else {
            System.out.format(this.flagaPola + "%4s\u001B[0m", output);            // \u001B[0m - ANSI_RESET kolor //"%4s\u001B[0m"
        }
        this.flagaPola = null;
    }
}
