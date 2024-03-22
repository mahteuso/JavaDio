

public class SetHashTest implements Comparable<SetHashTest>{

    private String name;

    public SetHashTest(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SetHashTest setHashTest) {
      return this.getName().compareTo(setHashTest.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SetHashTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
