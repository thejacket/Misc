/**
 * Created by mariusz on 2016-12-24.
 */

class Komunikat {
    static int atrybut = 0;
    Komunikat(String s){
        System.out.println("Konstruktor z parametrem s: " + s + "!");
        this.atrybut = 5;
    }
    static void statyczna(){
        System.out.println("Metoda statyczna!");
        atrybut = 10; //zmieni globalnie atrybut i kazdy kolejny stworzony obiekt bedzie mial atrybut = 10;
    }
}

public class asd4 {
    public static void main(String[] args){
        Komunikat.statyczna();
        Komunikat k = new Komunikat("parametr1");
        System.out.println("Atrybut obiektu k: " + k.atrybut);
        k.statyczna();
        System.out.println("Atrybut obiektu k po k.statyczna(): " + k.atrybut);
        System.out.println("Atrybut statyczny: " + Komunikat.atrybut);
        k.atrybut = 12;
        Komunikat.atrybut = 999;
        System.out.println("po zmianie Atrybut obiektu k: " + k.atrybut);
        System.out.println("po zmianie Atrybut statyczny: " + Komunikat.atrybut);
        k.atrybut = 12;         // znowu atrybut statyczny (ogolny dla klasy) zmieni swoja wartosc na 12!
        Komunikat z = new Komunikat("ZZZzzzZZZ");
        System.out.println("po zmianie Atrybut obiektu z: " + z.atrybut);
        System.out.println("po zmianie Atrybut statyczny: " + Komunikat.atrybut);
    }
}
