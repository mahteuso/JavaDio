import java.util.List;

public class Bank {
    private String name;

    private List<Account> account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getContas() {
        return account;
    }

    public void setAccounts(List<Account> account) {
        this.account = account;
    }
}
