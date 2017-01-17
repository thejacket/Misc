import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Date;

class predkoscDrogaCzas {
    BigDecimal droga;
    BigDecimal czas;
    BigDecimal predkosc;


    static BigDecimal obliczPredkosc(BigDecimal dr, BigDecimal cz) {
        return dr.divide(cz);
    }


    BigDecimal obliczDroge(BigDecimal pr, BigDecimal cz) {
        return pr.multiply(cz);
    }


    BigDecimal obliczCzas(BigDecimal pr, BigDecimal dr) {
        return dr.divide(pr);
    }
}


public class Main {


    public static void main(String[] args) {
            predkoscDrogaCzas pr = new predkoscDrogaCzas();
            pr.droga = new BigDecimal(100);
            pr.czas = new BigDecimal(200);
            pr.predkosc = new BigDecimal(100);
            System.out.println(pr.obliczCzas(pr.predkosc, pr.droga));
            System.out.println(predkoscDrogaCzas.obliczPredkosc(new BigDecimal(100), new BigDecimal(200)));
            /*
            try {
                System.out.println(args[0] + " " + args[1] + " " + args[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Niepoprawny parametr, rozmiar tablicy to: " + args.length + ", a powinno być: 3");
            } */

            //System.out.println(System.getProperty("java.library.path"));

        }

    }
