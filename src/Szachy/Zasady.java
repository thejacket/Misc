package Szachy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariusz on 2017-01-21.
 */
public abstract class Zasady {

    public static Map<String, Integer> getMapaWartosciPoczatkowych() {
        return mapaWartosciPoczatkowych;
    }

    // w jaki sposob abstrahowac od ilosci argumentow w metodzie abstrakcyjnej?
                                                                                // spakowanie i rozpakowanie argumentow?
    private static Map<String, Integer> mapaWartosciPoczatkowych = new HashMap<String, Integer>();
}
