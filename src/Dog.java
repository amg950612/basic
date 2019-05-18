public class Dog {

    private String breed;
    private String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    public Dog(){}

    @Override
    public String toString() {
        return
                "breed:"  + breed + '\'' +
                ", name: '" + name + '\'' +
                ", age: " + age
                ;
    }
}
