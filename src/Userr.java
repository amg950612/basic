import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Userr{

   static String name;
    int age;

    public Userr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName()
    {
        return name;
    }

    public static void main(String[] args)

    {
        users().map(user->Userr.getName()).forEach(System.out::println);

        move Move = ()-> System.out.println("run");
        Move.run();

    }

    public static Stream users ()

    {
        Userr anna = new Userr("Anna", 22);
        Userr marek = new Userr("Marek", 33);
        Userr pawel = new Userr("Pawel", 55);

        return Stream.of(anna,marek,pawel);
    }
}

interface move
{
    public void run();
}
