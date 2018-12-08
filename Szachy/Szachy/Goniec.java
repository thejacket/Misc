package Szachy;

import java.util.ArrayList;

/**
 * Created by mariusz on 2017-02-12.
 */
public class Goniec extends Figura{

    private static ArrayList<OdlegloscWspolrzednych> zasadyRuchowGoniec = new ArrayList<OdlegloscWspolrzednych>();

    private static int wartoscFigury = 3;

    public  int getWartoscFigury(){
        //System.out.println("wartoscFigury w goniec = " + wartoscFigury);
        return wartoscFigury;
    }

    static {
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(1,1));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(2,2));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(3,3));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(4,4));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(5,5));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(6,6));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(7,7));

        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-1,1));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-2,2));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-3,3));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-4,4));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-5,5));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-6,6));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-7,7));

        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(1,-1));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(2,-2));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(3,-3));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(4,-4));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(5,-5));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(6,-6));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(7,-7));

        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-1,-1));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-2,-2));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-3,-3));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-4,-4));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-5,-5));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-6,-6));
        zasadyRuchowGoniec.add(new OdlegloscWspolrzednych(-7,-7));
    }

    @Override
    protected ArrayList<OdlegloscWspolrzednych> getzasadyRuchow() {
        return zasadyRuchowGoniec;
    }

    public Goniec (Gracz gracz, int pozX, int pozY){
        super(gracz, "G", pozX, pozY);
    }
}
