/**
 * Created by mariusz on 2016-12-27.
 */


enum Banknotyenum {
    DZIESIEC, DWADZIESCIA, PIECDZIESIAT, STO, DWIESCIE
}

class Banknot{
    Banknotyenum noty;
    Banknot(Banknotyenum noty){
        this.noty = noty;
        System.out.println("\nOto banknot.. \n");
        switch(noty){
            case DZIESIEC:
                System.out.println(" dziesieciozlotowy.");
                break;
            case DWADZIESCIA:
                System.out.println(" dwudziestozlotowy.");
                break;
            case PIECDZIESIAT:
                System.out.println(" piecdziesieciozlotowy.");
                break;
            case STO:
                System.out.println(" stuzlotowy.");
                break;
            case DWIESCIE:
                System.out.println(" dwiescie zlotych!");
                break;
        }
    }
        }


public class asd7 {
    public static void main(String[] args) {
        System.out.println("Oto wszystkie banknoty:");
        for (Banknotyenum n: Banknotyenum.values()) {
            System.out.println(n);
        }
        Banknot dziesiec = new Banknot(Banknotyenum.DZIESIEC);
        Banknot dwiescie = new Banknot(Banknotyenum.DWIESCIE);
    }
}
