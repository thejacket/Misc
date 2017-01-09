import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mariusz on 2017-01-04.
 */

// PRYWATNE KONSTRUKTORY I METODA MAIN W KAŻDEJ KLASIE//
class Connection {
    static int index = 0;
    private Connection(){
        System.out.println("Stworzylem Connection o indexie = " + index);
        index++;
    }
    public static Connection makeConnection(){
        System.out.println("Jestem w metodzie makeConnection");
        return new Connection();
    }

    public static void main(String[] args) {
        for (Object x: new ArrayList<Object>(Arrays.asList(1,2,3,4,5))) {
            makeConnection();
        }
    }
}

class ConnectionManager {
    void CMmaker(){
        Connection.makeConnection();
    }
}

public class asd9 {
    public static void main(String[] args) {
        ConnectionManager cmanager = new ConnectionManager();
        for (int x = 0; x < 10; x++) {
            cmanager.CMmaker();
        }
    }
}
