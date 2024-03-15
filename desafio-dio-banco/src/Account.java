import java.util.ArrayList;
import java.util.List;

public abstract class Account implements IAccount {
    private static final int NUMBER_AGENCY = 123;
    private static int sequential = 1;
    protected int agencyNumber;
    protected int accountNumber;
    protected double balance;

    private static List<Client> listClient;

    private Client client;
    TypeAccount typeAccount;

    public Account(Client client, TypeAccount typeAccount){
        this.client = client;
        this.agencyNumber = NUMBER_AGENCY;
        this.accountNumber = sequential++;
        this.typeAccount = typeAccount;
        this.addClient(client);
    }



    @Override
    public void draw(double value) {
        balance += value;
    }

    @Override
    public void cash(double value) {
        double balanceFuture = balance - value;
        if (balanceFuture < 0){
            System.out.println("-----------------------------------------");
            System.out.println("You don't balance to this operation");
            System.out.println("-----------------------------------------");
        } else {
            balance -= value;
        }
    }

    @Override
    public void transfer(Account accountDestiny, double value) {
        double balanceFuture = balance - value;
        if (balanceFuture < 0){
            System.out.println("-----------------------------------------");
            System.out.println("You don't balance to this operation");
            System.out.println("-----------------------------------------");
        } else {
            balance -= value;
            accountDestiny.draw(value);
        }
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void getBalance(){
        System.out.println("=========== Bank Statement ============");
        System.out.println("Account type: " + typeAccount.VALUE);
        System.out.println("Agency Number: " + this.agencyNumber);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Client: "+ client.getName() + "\nBalance: " + this.balance);
    }

   private void addClient(Client client){
        listClient.add(client);
    }
    public static void getClients(){
        System.out.println("======== List of all customers =========");
        for (Client client : listClient){
            System.out.println(client);
        }
    }

}
