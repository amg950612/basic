import java.util.*;

public class Lists {

    public static void main(String[] args) {

        //one zastepuja zwykle tablice [], maja wbudowane metody itd.

        //listy
        List<String> list1 = new ArrayList<>(); //lista zwykla
        List<String> list2 = new LinkedList<>(); //lista wiazana

        //zbior
        Set<String> set = new HashSet<>(); //elementy w zbiorze NIE moga sie powtarzac

        //mapy - maja klucz i wartosc
        Map <Integer, String> map1 = new HashMap<>();
        Map <Integer,String> map2 = new TreeMap<>();
        Map <Integer, String> map3 = new LinkedHashMap<>();

        //listy przykladowe metody
        list1.add("Marek"); // dodaje element do listy
        list1.get(0); //pobiera wartosc po indeksie = wypisze Marek
        list1.remove("Marek"); // usuwa element z listy
        int size = list1.size(); // zwraca wielkosc listy
        list1.add(0,"Pawel"); //dodaje za pomoca indeksu i wartosci przypisanej do indeksu
        boolean istnieje =  list1.contains("Pawel"); // zwraca boolean czy element istnieje w liscie

        for (String x: list1) //petla foreach zwraca elementy z listy zwroci Pawla
        {
            System.out.println(x);
        }

        //zbiory
        set.add("Jan");
        set.remove(0); //tutaj podaje indeks do usuniecia elementu

        //mapy
        map1.put(0,"Anna");
        map1.put(1,"Jan");

        Object value =  map1.values(); // przypisanie wartosci z mapy do tablicy
        System.out.println(value); //zwroci wartosci wpisane w mape

        Object [] values  = ((Collection) value).toArray(); // mozna zrzutowac zbior do zwyklej tablicy
        Object val = values[0]; // i pobrac wartosc na indeksie 0

        System.out.println(val); // wyswietli Anne

        Set keys = map1.keySet(); // przypisanie kluczy z mapy do tablicy
        System.out.println(keys); //zwroci klucze w mapie

        Object [] key = ((Collection) keys).toArray(); //rzutuje do tablicy
        Object k = key[0]; // pobiera wartosc przy indeksie 0

        System.out.println(k); //wyrzuci 0

        for (Map.Entry<Integer,String> y: map1.entrySet()) //zwroci klucze i wartosci
        {
            System.out.println("Indeks: " + y.getKey() + " " + " wartosc : " + y.getValue());
        }

    }
}
