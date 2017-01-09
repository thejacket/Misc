package wielomiany;

/**
 * Created by mariusz on 2017-01-05.
 */
public class Wielomian {

    int[] tab_wsp;

    Wielomian(int[] ORYGINAL) {

        this.tab_wsp = new int[ORYGINAL.length];

        for(int i = 0; i < this.tab_wsp.length; i++){

            this.tab_wsp[i] = ORYGINAL[i];

        }

    }

    void pomnóżsię(int mnoznik) {
        for (int i = 0; i < tab_wsp.length; i++) {

            tab_wsp[i] = tab_wsp[i] * mnoznik;

        }
    }

    Wielomian dodaj(Wielomian w2) {
        Wielomian glowny;
        Wielomian dodawany;

        if (w2.tab_wsp.length >= this.tab_wsp.length) {
            glowny = new Wielomian(w2.tab_wsp);                         // tworzenie nowych obiektow zeby nie zmieniac dodawanego przy dodawaniu
            dodawany = new Wielomian(this.tab_wsp);
        } else {                                                        // zapytać się jaka jest najlepsza metoda kopiowania obiektów?
            glowny = new Wielomian(this.tab_wsp);
            dodawany = new Wielomian(w2.tab_wsp);
        }

        for (int i = 0; (i < dodawany.tab_wsp.length); i++) {

            glowny.tab_wsp[i] = glowny.tab_wsp[i] + dodawany.tab_wsp[i];

        }

        return glowny;
    }


    @Override
    public String toString() {
        //try { - tutaj tez nie mozna?
        String s = (tab_wsp[0] < 0) ? "" + tab_wsp[0] : "";
        try {
            for (int i = 0; i < tab_wsp.length; i++) {

                if (tab_wsp[i] == 0) {
                    continue;
                } else if (tab_wsp[i] < 0) {
                    s = s + tab_wsp[i] + "*x^" + i;
                } else {
                    s = s + "+" + tab_wsp[i] + "*x^" + i;
                }
            }
            //System.out.println(s.toCharArray()[0]); // dlaczego wywala błąd? s.toCharArray() nie wywala, nie wywala też jak umiesci sie w forze
            char[] s1 = s.toCharArray();
            return s.substring(1);

            //TODO: nie wyswietla ujemnego znaku pierwszego wspolczynnika! (mianu 0)

        } catch (StringIndexOutOfBoundsException e) {
            return s;
        } catch (ArrayIndexOutOfBoundsException e) {
            return s;
        }
        // ---------------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!------------------------------
        // return s.substring(1); ---------------- nie rozumiem dlaczego nie mogę tutaj dać returna.. ////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
    }


    public static void main(String[] args) {
        int[] tabMain = new int[]{1, 2, 3, 4, 5};
        int[] tabMain2 = new int[]{1, 2, 3, 4, 5};
        int[] tabMain3 = new int[]{1, 2, 3, 4, 5};
        Wielomian w = new Wielomian(tabMain3);
        System.out.println(w.toString());
        //w.pomnoz(10);
        System.out.println(w.toString());
        Wielomian w3 = w.dodaj(new Wielomian(tabMain3));
        System.out.println(w3.toString());
    }


    public static void test(){

        // Czy puste tablice są prawidłowo obsługiwane (ini i wyp.)?

        Wielomian w1 = new Wielomian(new int[0]);

        System.out.println("ini: w1 = " + w1);



        // Czy niepuste tablice są prawidłowo obsługiwane (ini i wyp.)?

        int[] wsp1 = new int[]{1,2,3,4,5};

        Wielomian w2 = new Wielomian(wsp1);

        System.out.println("ini: w2 = " + w2);



        // Czy działa mnożenie? Czy działania wypisywanie ujemnych współczynników?

        w2.pomnóżsię(-2);

        System.out.println("mnz: w2 = "+w2);



        // Czy działa dodawanie wielomianów różnej długości?

        Wielomian w3 = w2.dodaj(w1);

        System.out.println("dod: w3=w2+w1= "+w3);



        // Czy konstr. kopiuje tablicę?

        for(int i=0; i<wsp1.length; i++)

            wsp1[i] = -wsp1[i];

        System.out.println("tst: w2 = " + w2);



        // Czy dodawanie wielomianu do samego siebie nie powoduje błędów?

        System.out.println("dod: w2+w2 = " + w2.dodaj(w2));



        // Czy dodawanie nie zmienia dodawanego wielomianu?

        System.out.println("tst: w2 = " + w2);

    }


}


