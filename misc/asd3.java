import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mariusz on 2016-12-23.
 */

class VampyreNumber{
    ArrayList<String> findVamp(){
        ArrayList<String> vampList = new ArrayList<String>();
        for (Integer i = 10; i < 9999; i++){
            char[] s1 = i.toString().toCharArray();
            for (Integer x = 10; x < 9999; x++){
                char[] s2 = x.toString().toCharArray();
                Integer result = i * x;
                String result_string = result.toString();

                if (result_string.length() == 8) {

                    char[] kurwa = result_string.toCharArray();
                    ArrayList<Character> clistresult = new ArrayList<Character>();
                    for (char c: kurwa) {
                        clistresult.add(c);
                    }
                    for (int counter = 0; counter < 4; counter++)
                    {
                        if (clistresult.contains(s1[counter])){
                            clistresult.remove(clistresult.indexOf(s1[counter]));
                        }
                    }
                    for (int counter = 0; counter < 4; counter++)
                    {
                        if (clistresult.contains(s2[counter])){
                            clistresult.remove(clistresult.indexOf(s2[counter]));
                        }
                    }
                    if (clistresult.isEmpty()) {
                        vampList.add(i.toString());
                        vampList.add(x.toString());
                        vampList.add(result_string);
                    }
                }

            }
        }
        return (vampList);
    }
}

public class asd3 {
    public static void main(String[] args) {
        VampyreNumber v = new VampyreNumber();
        ArrayList<String> list = v.findVamp();
        int count = 0;
        for (String x: list) {

            System.out.print(x + " ");
            count++;
            if (count % 3 == 0) {
                System.out.println();
            }
        }
    }
}

