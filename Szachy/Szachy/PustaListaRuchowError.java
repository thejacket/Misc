package Szachy;

/**
 * Created by mariusz on 2017-02-15.
 */
public class PustaListaRuchowError extends Throwable{
    public PustaListaRuchowError() {
        System.out.println("\nPustaListaRuchowError - co najmniej jeden z graczy nie ma figur lub nie moze wykonac poprawnego ruchu!");
    }
}
