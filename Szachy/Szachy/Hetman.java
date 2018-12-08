package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Hetman extends Figura {


    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowHetman = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 7;

    public  int getWartoscFigury(){
        return wartoscFigury;
    }

    static {
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(1,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(2,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(3,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(4, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(5, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(6, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(7, 0));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-1,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-2,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-3,0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-4, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-5, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-6, 0));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-7, 0));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, 7));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(0, -7));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(1,1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(2,2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(3,3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(4,4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(5,5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(6,6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(7,7));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(1,-1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(2,-2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(3,-3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(4,-4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(5,-5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(6,-6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(7,-7));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-1,1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-2,2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-3,3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-4,4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-5,5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-6,6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-7,7));

        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-1,-1));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-2,-2));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-3,-3));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-4,-4));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-5,-5));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-6,-6));
        zasadyRuchowHetman.add(new OdlegloscWspolrzednych(-7,-7));

    }

    @Override
    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow() {
        return zasadyRuchowHetman;
    }

    public Hetman (Gracz gracz, int pozX, int pozY){

        super(gracz, "H", pozX, pozY);

    }
}
