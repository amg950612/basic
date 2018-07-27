import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List <List<String>> list1 = new ArrayList();
        List <String> list2 = new ArrayList<>();

        list2.add("Ala");
        list2.add("Jacek");

        list1.add(list2);

        Object [] tablica = list1.toArray();

        for (List<String> x: list1)
        {
            System.out.println(x.get(1));
        }


    }
}
