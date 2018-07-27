import com.sun.xml.internal.fastinfoset.algorithm.IntegerEncodingAlgorithm;

import java.util.StringJoiner;

public class CiagiZnakowe {


    public static void main(String[] args) {
        String x = "Ala";
        String y = " ma";
        String z = " kota";

        String k = x+y+z;
        k = "Ala ma psa";

        StringBuilder builder= new StringBuilder();
        StringBuilder ala = builder.append("Ala").append(" ma").append(" kota");

        ala = builder.append("Ala").append(" ma").append(" psa");

        StringBuffer buffer = new StringBuffer();
        StringBuffer ala1 = buffer.append("Ala").append(" ma").append(" kota");

        ala1 = buffer.append("Ala").append(" ma").append(" psa");

        System.out.println(k);
        System.out.println(ala);
        System.out.println(ala1);

        String a = "444";

        Integer u = Integer.valueOf(a);
        System.out.println(u);


    }
}
