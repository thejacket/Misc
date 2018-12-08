package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Wieza extends Figura {

    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowWieza = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 5;

    public  int getWartoscFigury(){
        return wartoscFigury;
    }

    static {

        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(1,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(2,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(3,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(4, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(5, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(6, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(7, 0));

        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 1));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 2));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 3));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 4));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 5));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 6));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, 7));

        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-1,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-2,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-3,0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-4, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-5, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-6, 0));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(-7, 0));

        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -1));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -2));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -3));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -4));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -5));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -6));
        zasadyRuchowWieza.add(new OdlegloscWspolrzednych(0, -7));

    }

    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow(){ return zasadyRuchowWieza;};

    public Wieza (Gracz gracz, int pozX, int pozY){

        super(gracz, "W", pozX, pozY);


    }
}
