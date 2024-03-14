import java.util.List;

public class CurrentAccount {
    private int agency;
    private int accountNumber;
    private double balance;
    private List<Client> client;

    public CurrentAccount(int agency, int accountNumber, double balance){
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void sacar(){}
    public void depositar(){}
    public void transferir(){}

    public int getAgency() {
        return agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
