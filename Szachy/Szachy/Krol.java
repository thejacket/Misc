package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Krol extends Figura{

    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowKrol = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 10;

    public  int getWartoscFigury(){
        return wartoscFigury;
    }

    static {

        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(1,1));
        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(1,-1));
        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(1,0));

        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(0,1));
        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(0,-1));

        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(-1,1));
        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(-1,-1));
        zasadyRuchowKrol.add(new OdlegloscWspolrzednych(-1,0));

    }

    @Override
    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow() {
        return zasadyRuchowKrol;
    }

    public Krol (Gracz gracz, int pozX, int pozY){

        super(gracz, "K", pozX, pozY);

    }
}
