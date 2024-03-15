import java.util.ArrayList;
import java.util.List;

public class SavingsAccount extends Account {

    private double balance;
    TypeAccount typeAccount;

    public SavingsAccount(Client client, TypeAccount typeAccount) {
        super(client, typeAccount);
        this.typeAccount = typeAccount;
    }

    @Override
    public void getBalance() {
        super.getBalance();
    }

}
