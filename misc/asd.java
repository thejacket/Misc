import java.util.Random;

/**
 * Created by mariusz on 2016-12-18.
 */

class RzutMoneta {

    int ile_razy;
    boolean[] wyniki;
    //boolean[] wyniki = new boolean[???];

    RzutMoneta(int ile)
    {
        this.ile_razy = ile;
        //boolean[] wyniki = new boolean[ile_razy];
    }

    //boolean[] wyniki = new boolean[ile_razy];

    boolean[] rzucaj() {
        for (int i = 0; i < ile_razy+1; i++)
        {
            Random rand = new Random();
            boolean wynik = rand.nextBoolean();
            wyniki[i] = wynik;
        }
        return (wyniki);
    }
}

public class asd {
    public static void main(String[] args) {
       RzutMoneta rz = new RzutMoneta(10);
       boolean[] array = rz.rzucaj();
       for (int i = 0; i < array.length; i++)
       {
           System.out.println(array[i]);
       }
    }
}
