import java.util.*;


public class Governor {

   private static Set <String> set;

   static Map <String,String> company = new HashMap<>();

   static List <String> codes = new ArrayList<>();

    public static void main(String[] args) {

        codes.add("47.99.Z");
        codes.add("63.12.Z");
        codes.add("47.19.Z");
        codes.add("63.11.Z");
        codes.add("95.11.Z");

        company.put("47.99.Z", "Pozostała sprzedaż detaliczna prowadzona poza siecią sklepową, straganami i targowiskami");
        company.put("63.12.Z", "Działalność portali internetowych");
        company.put("47.19.Z", "Pozostała sprzedaż detaliczna prowadzona w niewyspecjalizowanych sklepach");
        company.put("00.00.0", "blablabla");


        set =  company.keySet();

        Object [] tablica1 = set.toArray();

        Object [] tablica2 = codes.toArray();

        validation1(tablica1,tablica2);

        System.out.println("///////////////////////////////////////");

        validation2(codes);

    }
        private static void validation1 (Object [] tablica1, Object [] tablica2)
        {
            int x = tablica1.length;
            int y = tablica2.length;
            Object [] tablica3 = new Object [5];


            for (int i=0; i<x; i++)
            {
                for (int j=0; j<y; j++)
                {
                    if (tablica1[i] == tablica2[j])
                    {
                        tablica3[j] = tablica1[i];
                    }
                }
            }
            int z = tablica3.length;

            for (int k=0;k<z; k++)
            {
                if (tablica3[k]!=null)
                System.out.println(tablica3[k]);
                else System.out.println("Wrong data");
            } ;

        }

        private static void validation2 (List <String> codes)
        {
            codes.retainAll(set);

          int size = codes.size();
            for (String x: codes)
            {
                System.out.println(x);
            }

        }

    }




