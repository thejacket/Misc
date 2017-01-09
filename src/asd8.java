/**
 * Created by mariusz on 2017-01-01.
 */

class Chuj {
    private int prywatny = 10;
    protected int chroniony = 100;
    public int publiczny = 1000;

    private int prywatna(){
        return 10;
    }
    protected int chroniona(){
        return 100;
    }
    public int publiczna(){
        return 1000;
    }
}


public class asd8 {


    public static void main(String[] args) {
        Chuj chuj = new Chuj();
        System.out.println("chroniona = " + chuj.chroniona());
        System.out.println("chroniony = " + chuj.chroniony);
        }
}
