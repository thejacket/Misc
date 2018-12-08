package Szachy;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-11.
 */
public abstract class Figura {

    static class OdlegloscWspolrzednych {
        int x, y;

        OdlegloscWspolrzednych(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    protected abstract ArrayList<OdlegloscWspolrzednych> getzasadyRuchow();

    private Gracz gracz;
    private String reprezentacjaGraficznaFigury;

    protected int pozX, pozY;

    public Figura(Gracz gracz, String string, int pozX, int pozY) {
        this.gracz = gracz;
        this.pozX = pozX;
        this.pozY = pozY;

        if (gracz.getKolor().equals("białe") == true) {

            this.reprezentacjaGraficznaFigury = string;

        } else
            this.reprezentacjaGraficznaFigury = string.toLowerCase();
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
                boolean drogaZablokowanaPrzezWlasnaFigure = false;

                while (!pozycja.equals(cel)) {
                    pozycja.x = pozycja.x + kierunekX; // DZIALAJACE BEZ
                    pozycja.y = pozycja.y + kierunekY; // DZIALAJACE BEZ
                    if (plansza.getKonkretnePole(pozycja.x, pozycja.y).getFiguraNaPolu() != null) {
                        drogaZablokowana = true;
                        if (plansza.getKonkretnePole(pozycja.x, pozycja.y).getFiguraNaPolu().getGracz() == this.gracz) {
                            drogaZablokowanaPrzezWlasnaFigure = true;
                        }
                        break;          // bo kolizja już wykryta
                    }
                }
                if ((!drogaZablokowana) || (drogaZablokowana && !drogaZablokowanaPrzezWlasnaFigure)) {
                    listaRuchow.add(new Ruch(pozX, pozY, pozycja.x, pozycja.y, plansza)); //cel.x cel.y
                }

            }

        }
        return listaRuchow;
    }


    public Gracz getGracz() {
        return gracz;
    }

    @Override
    public String toString() {

        return this.reprezentacjaGraficznaFigury;

    }

    public abstract int getWartoscFigury();

    public void setPozX(int pozX) {
        this.pozX = pozX;
    }

    public void setPozY(int pozY) {
        this.pozY = pozY;
    }
}
