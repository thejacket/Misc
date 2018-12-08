package Szachy;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Pionek extends Figura {


    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowPionekNaGorzePierwszyRuch = new ArrayList<OdlegloscWspolrzednych>();
    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowPionekNaDolePierwszyRuch = new ArrayList<OdlegloscWspolrzednych>();
    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowPionekNaGorze = new ArrayList<OdlegloscWspolrzednych>();
    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowPionekNaDole = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 1;

    public int getWartoscFigury(){
        return wartoscFigury;
    }

    private boolean czyPierwszyRuchFlag = true;

    public void setCzyPierwszyRuchFlag(boolean flag){
        this.czyPierwszyRuchFlag = flag;
    }

    static {

        zasadyRuchowPionekNaGorzePierwszyRuch.add(new OdlegloscWspolrzednych(1,0));
        zasadyRuchowPionekNaGorzePierwszyRuch.add(new OdlegloscWspolrzednych(2,0));

        zasadyRuchowPionekNaDolePierwszyRuch.add(new OdlegloscWspolrzednych(-1,0));
        zasadyRuchowPionekNaDolePierwszyRuch.add(new OdlegloscWspolrzednych(-2,0));

        zasadyRuchowPionekNaGorze.add(new OdlegloscWspolrzednych(1,0));
        zasadyRuchowPionekNaDole.add(new OdlegloscWspolrzednych(-1,0));

    }

    @Override
    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow() {
        if (this.czyPierwszyRuchFlag == true) {
            if (this.getGracz().getGoraCzyDol() == "dol") {
                return zasadyRuchowPionekNaDolePierwszyRuch;
            } else {
                return zasadyRuchowPionekNaGorzePierwszyRuch;
            }
        } else {
            if (this.getGracz().getGoraCzyDol() == "dol") {
                return zasadyRuchowPionekNaDole;
            } else {
                return zasadyRuchowPionekNaGorze;
            }
        }
    }


    public ArrayList<Ruch> znajdzWszystkieMozliweRuchy(Plansza plansza) {
        ArrayList<Ruch> listaRuchow = new ArrayList<Ruch>();
        for (OdlegloscWspolrzednych odl : this.getzasadyRuchow()) {
            {
                Point pozycja = new Point(pozX, pozY);
                Point cel = new Point(pozX + odl.x, pozY + odl.y);

                if (cel.x > 7 || cel.x < 0 || cel.y > 7 || cel.y < 0) {
                    continue;
                }

                int kierunekX = (int) Math.signum(cel.x - pozX);
                int kierunekY = (int) Math.signum(cel.y - pozY);

                boolean drogaZablokowana = false;

                while (!pozycja.equals(cel)) {
                    pozycja.x = pozycja.x + kierunekX;
                    pozycja.y = pozycja.y + kierunekY;
                    if (plansza.getKonkretnePole(pozycja.x, pozycja.y).getFiguraNaPolu() != null) {
                        drogaZablokowana = true;
                        break;          // bo kolizja już wykryta
                    }
                }
                if ((!drogaZablokowana)) {
                    listaRuchow.add(new Ruch(pozX, pozY, pozycja.x, pozycja.y, plansza));
                }
                if (this.pozX >= 1 && this.pozX <= 6 && this.pozY >= 1 && this.pozY <= 6 ) {

                    if (this.getGracz().getGoraCzyDol() == "dol") {

                        Figura f1 = plansza.getKonkretnePole(this.pozX - 1, this.pozY - 1).getFiguraNaPolu();
                        Figura f2 = plansza.getKonkretnePole(this.pozX - 1, this.pozY + 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }

                        if (f2 != null && f2.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f2.pozX, f2.pozY, plansza));
                        }

                    } else {

                        Figura f1 = plansza.getKonkretnePole(this.pozX + 1, this.pozY - 1).getFiguraNaPolu();
                        Figura f2 = plansza.getKonkretnePole(this.pozX + 1, this.pozY + 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }

                        if (f2 != null && f2.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f2.pozX, f2.pozY, plansza));
                        }
                    }
                } else if (this.pozX >= 1 && this.pozX <= 6 && this.pozY == 0 ) {
                    if (this.getGracz().getGoraCzyDol() == "dol") {
                        Figura f1 = plansza.getKonkretnePole(this.pozX - 1, this.pozY + 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }
                    } else {
                        Figura f1 = plansza.getKonkretnePole(this.pozX + 1, this.pozY + 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }
                    }
                } else if (this.pozX >= 1 && this.pozX <= 6 && this.pozY == 7 ) {
                    if (this.getGracz().getGoraCzyDol() == "dol") {
                        Figura f1 = plansza.getKonkretnePole(this.pozX + 1, this.pozY - 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }
                    } else {
                        Figura f1 = plansza.getKonkretnePole(this.pozX - 1, this.pozY - 1).getFiguraNaPolu();

                        if (f1 != null && f1.getGracz() != this.getGracz()) {
                            listaRuchow.add(new Ruch(pozX, pozY, f1.pozX, f1.pozY, plansza));
                        }
                    }
                }
            }
        }
        return listaRuchow;
    }




    public Pionek (Gracz gracz, int pozX, int pozY){
        super(gracz, "P", pozX, pozY);

    }
}
