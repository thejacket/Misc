package Szachy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariusz on 2017-02-12.
 */
public class GeneratorKolorowPol {
    private int i = -1;
    private static Map<Integer, String> bialeCzyCzarne = new HashMap<>();

    static {
        bialeCzyCzarne.put(1, "białe");
        bialeCzyCzarne.put(-1, "czarne");
    }

    public String next() {
        i = i * -1;
        return bialeCzyCzarne.get(i);
    }

    public static void main(String[] args) {
        GeneratorKolorowPol gen = new GeneratorKolorowPol();
        System.out.println(gen.next());
        System.out.println(gen.next());
        System.out.println(gen.next());
    }
}
