import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Users {

   private static List<Users> list;
   private String name;
   private int age;

    private Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Users (){}

    public static void main(String[] args) {

        list = new ArrayList<>();

        Users jan = new Users("Jan", 44);
        Users jan2 = new Users("Jan", 45);

        addUser(jan);
        System.out.println(list);
        addUser(jan2);
        System.out.println(list);
    }

    private static void addUser(Users user) {
        if (list.contains(user)) {
            list.remove(user);
        }
        list.add(user);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



