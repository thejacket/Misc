/**
 * Created by mariusz on 2016-12-26.
 */


class Cup {
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1 = new Cup(1);
    static Cup cup2 = new Cup(2);
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}

public class asd5 {
    public static void main(String[] args){
        System.out.println("Wewnątrz main()");
        Cups.cup1.f(99);
        Cups.cup1.f(1);
    }
}


/* O KURWA !!!
ArrayList insuranceClaims = new ArrayList();
List insuranceClaims = new ArrayList();
Collection insuranceClaims = new ArrayList();
kiedy uzywac typow primitve vs. obiektow? */