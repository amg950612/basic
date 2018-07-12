import java.util.ArrayList;
import java.util.List;

public class ListEx  {

    public static void main(String[] args)  {

        List<String> names = new ArrayList<>();
        names.add("Kris");
        names.add("Ira");

        System.out.println("Size = " + names.size());

        for(String x:names)
        {
            System.out.println(x);
        }

        System.out.println( names.contains("Adam") );
    }
}
