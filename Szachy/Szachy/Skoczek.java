package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Skoczek extends Figura {


    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowSkoczek = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 3;

    public  int getWartoscFigury(){
        return wartoscFigury;
    }

    static {

        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(1, 2));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(1, -2));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(2, -1));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(2, 1));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(-1, 2));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(-1, -2));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(-2, -1));
        zasadyRuchowSkoczek.add(new OdlegloscWspolrzednych(-2, 1));

    }

    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow(){
        return zasadyRuchowSkoczek;
    }

    @Override
    public ArrayList<Ruch> znajdzWszystkieMozliweRuchy(Plansza plansza) {
        ArrayList<Ruch> listaRuchow = new ArrayList<Ruch>();
        for (OdlegloscWspolrzednych odl : zasadyRuchowSkoczek) {

            int noweX = pozX + odl.x;
            int noweY = pozY + odl.y;

            if (noweX > 7 || noweX < 0 || noweY > 7 || noweY < 0) {
                continue;
            }

            if (plansza.getKonkretnePole(noweX,noweY).getFiguraNaPolu() != null) {
                    if (plansza.getKonkretnePole(noweX,noweY).getFiguraNaPolu().getGracz() == this.getGracz()){
                        continue;
                }
                            }

            Ruch r = new Ruch(pozX, pozY, noweX, noweY, plansza);
            listaRuchow.add(r);

            }

        return listaRuchow;

    }

    public Skoczek (Gracz gracz, int pozX, int pozY){
        super(gracz, "S", pozX, pozY);

    }
}
