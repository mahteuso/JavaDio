import java.util.Collections;

public class Cat implements Comparable<Cat> {

    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.name.compareToIgnoreCase(cat.getName());
    }
}
