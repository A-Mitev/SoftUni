
public class Person {
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
