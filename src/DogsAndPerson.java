import java.util.*;

public class DogsAndPerson {

    private static List <Dog> list;
    private static  Map <Person, List<Dog>> map;

    public static void main(String[] args) {

        list = new ArrayList<>();
        map = new HashMap<>();

        Person Marek = new Person("Marek","Kowalski",33,'M');
        Person Jan = new Person ("Jan", "Nowak", 44, 'M');

        Dog mops = new Dog("Mops","Jack",5);
        Dog labrador = new Dog("Labrador", "Tom", 4);
        Dog owczarek = new Dog("Owczarek", "Jack",3);

        list.add(0,mops);
        list.add(1,labrador);
        list.add(2,owczarek);

        addDogs(Marek,list,0);
        addDogs(Marek, list,1);
        addDogs(Jan, list,2);

        for (Map.Entry<Person, List<Dog>> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " has " + entry.getValue());
        }

    }

    private static void addDogs (Person person, List <Dog> list, int dogNumber)
    {
         List list1 = new ArrayList();

         list1.add(list.get(dogNumber));

         map.put(person, list1);
    }
}

