import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Arrays.asList;

/**
 * Created by mariusz on 2016-12-21.
 */

class Fibonacci{
    ArrayList<Integer> zrobTab(int limit){
        int value = 1;
        ArrayList<Integer> tab = new ArrayList<Integer>(asList(1));
        //tab.add(1);
        for(int i = 0; i < limit; i++){
            tab.add(value);
            value = tab.get(tab.size()-2) + value;
        }
        return tab;
    }
}

public class asd2 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        ArrayList tab = fib.zrobTab(10);
        for (Object x: tab) {                   // why no Integer x: tab
            System.out.println(x);
        }
    }
}
