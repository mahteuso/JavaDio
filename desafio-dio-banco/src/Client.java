public class Client {
    private String name;
    private long cpf;

    public Client(String name, long cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
