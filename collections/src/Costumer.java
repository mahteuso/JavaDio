import java.util.concurrent.ThreadLocalRandom;

public class Costumer implements Comparable<Costumer>{

    private String name;
    private Long id;

    public Costumer(String name){
        this.name = name;
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
    }
    @Override
    public int compareTo(Costumer costumer) {
        return this.getId().compareTo(costumer.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                '}';
    }
}
