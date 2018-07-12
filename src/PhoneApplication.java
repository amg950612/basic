import java.util.HashMap;
import java.util.Map;

public class PhoneApplication {

    private static Map<String, User> listOfUsers;

    private static Map<User, Address> listOfUsersAddresses;


    public static void main(String[] args) {

        listOfUsers = new HashMap<>();
        listOfUsersAddresses = new HashMap<>();

        User marek = new User("Marek", 33, 'M');
        User jan = new User("Jan", 22, 'M');
        User pawel = new User("Paweł", 44, 'M');
        User anna = new User("Anna", 33, 'K');

        Address krakow = new Address("Zakopianka", 34333, "Krakow");
        Address wroclaw = new Address("Liljowa", 22113, "Wroclaw");
        Address gdansk = new Address("Konopnickiej", 44432, "Gdansk");

        PhoneApplication.addUser("Marek", marek);
        PhoneApplication.addUser("Jan", jan);
        PhoneApplication.addUser("Paweł", pawel);

        PhoneApplication.addAddress(marek,krakow);
        PhoneApplication.addAddress(jan,wroclaw);
        PhoneApplication.addAddress(pawel,gdansk);



        for (Map.Entry<String, User> entry:listOfUsers.entrySet())
        {
            System.out.println("About " + entry.getKey() +": " + entry.getValue());
        }

        System.out.println("/////////////////////");
/*
        PhoneApplication.deleteUser("Marek");

       for (Map.Entry<String, User> entry:listOfUsers.entrySet())
        {
            System.out.println("About " + entry.getKey() +": " + entry.getValue());
        }
*/
        PhoneApplication.addAddress(marek,krakow);
        PhoneApplication.addAddress(jan,wroclaw);
        PhoneApplication.addAddress(pawel,gdansk);

        for (Map.Entry<User, Address> entry:listOfUsersAddresses.entrySet())
        {
            System.out.println("About " + entry.getKey() +": " + entry.getValue());
        }

    }

    private static void addUser(String name, User user)
    {
        listOfUsers.put(name,user);
    }

    private static void deleteUser(String name)
    {
        listOfUsers.remove(name);
    }

    private static void addAddress(User user, Address address)
    {
        listOfUsersAddresses.put(user,address);
    }

    private static void deleteAddress(User user)
    {
        listOfUsersAddresses.remove(user);
    }
}

class User
{
  private String name;
  private int age;
  private char sex;


    protected User(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                 name + ", " +
                  age + ", " +
                  sex;
    }
}

class Address
{
    private String street;
    private int zipcode;
    private String city;

    protected Address(String street, int zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                street + ", " +
                        zipcode + ", " +
                        city;
    }
}