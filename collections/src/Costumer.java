import java.util.concurrent.ThreadLocalRandom;

public class Costumer implements Comparable<Costumer>{

    private String name;
    private Long id;

    public Costumer(String name){
        this.name = name;
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
    }
    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Costumer costumer) {
        return this.getName().compareTo(costumer.getName());
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                '}';
    }
}
