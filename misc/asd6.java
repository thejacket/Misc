/**
 * Created by mariusz on 2016-12-27.
 */



class Klasa{
    Klasa(String s){
        System.out.println(s);
        }
    }

public class asd6 {

    public static void main(String[] args) {
        Klasa[] kl_ar = new Klasa[10];
        for (int i = 0; i < kl_ar.length; i++) {
            kl_ar[i] = new Klasa("a");
        }
    }
}
