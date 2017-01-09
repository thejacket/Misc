import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by mariusz on 2017-01-05.
 */
public class Zadanie2 {
    int fib_rek(int n){

        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        return fib_rek(n-1) + fib_rek(n-2);

    }



    int fib_iter(int n){

        if (n == 0) return 0;

        int value = 1, new_value = 1, old_value = 0;
        for (int i = 1; i < n; i++) {

            new_value = value + old_value;
            old_value = value;
            value = new_value;

        }
        return new_value;
    }



    void wypisz(int n){

        for(int i=0; i<=n; i++){

            System.out.println("F("+i+") = " + fib_rek(i));

            System.out.println("F("+i+") = " + fib_iter(i));

        }

    }


    public static void main(String[] args){

        Zadanie2 o = new Zadanie2(); // Wkrótce wyjaśnimy na wykładzie co znaczy ten wiersz

        o.wypisz(45);

    }



}
