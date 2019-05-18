public class Person {

    private String name;
    private String last_name;
    private int age;
    private char sex;

    public Person(String name, String last_name, int age, char sex) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.sex = sex;
    }
    public Person ()
    {

    }

    @Override
    public String toString() {
        return
                "name: " + name + '\'' +
                ", last_name: " + last_name + '\'' +
                ", age: " + age +
                ", sex: " + sex
                ;
    }
}
