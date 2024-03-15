import java.util.ArrayList;
import java.util.List;

public class CurrentAccount extends Account{
    private double balance;
    TypeAccount typeAccount;

    public CurrentAccount(Client client, TypeAccount typeAccount) {
        super(client, typeAccount);
    }

    @Override
    public void getBalance() {
        super.getBalance();
    }
}
