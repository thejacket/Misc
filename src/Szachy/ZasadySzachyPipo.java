package Szachy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariusz on 2017-01-21.
 */
public class ZasadySzachyPipo extends Zasady {

    //getMapaWartosciPoczatkowych?

    private static Map<String, Integer> mapaWartosciPoczatkowych = new HashMap<String, Integer>();
    static {                                                            // ustalona pozycja bialych i czarnych, zamiana nastepuje w innej klasie
        mapaWartosciPoczatkowych.put("A1", 5);      // wieza
        mapaWartosciPoczatkowych.put("A2", 2);      // skoczek
        mapaWartosciPoczatkowych.put("A3", 3);      // goniec
        mapaWartosciPoczatkowych.put("A4", 10);     // krol
        mapaWartosciPoczatkowych.put("A5", 7);      // krolowa
        mapaWartosciPoczatkowych.put("A6", 3);      // goniec
        mapaWartosciPoczatkowych.put("A7", 2);      // skoczek
        mapaWartosciPoczatkowych.put("A8", 5);      // wieza

        mapaWartosciPoczatkowych.put("H1", 5);      // wieza
        mapaWartosciPoczatkowych.put("H2", 2);      // skoczek
        mapaWartosciPoczatkowych.put("H3", 3);      // goniec
        mapaWartosciPoczatkowych.put("H4", 7);      // krol
        mapaWartosciPoczatkowych.put("H5", 10);     // krolowa
        mapaWartosciPoczatkowych.put("H6", 3);      // goniec
        mapaWartosciPoczatkowych.put("H7", 2);      // skoczek
        mapaWartosciPoczatkowych.put("H8", 5);      // wieza

        for (int i = 1; i <= 8; i++){
            mapaWartosciPoczatkowych.put("B" + i, 1);    // piony
            mapaWartosciPoczatkowych.put("C" + i, 0);    // puste pola
            mapaWartosciPoczatkowych.put("D" + i, 0);    // puste pola
            mapaWartosciPoczatkowych.put("E" + i, 0);    // puste pola
            mapaWartosciPoczatkowych.put("F" + i, 0);    // puste pola
            mapaWartosciPoczatkowych.put("G" + i, 1);    // piony
        }

    }


}
