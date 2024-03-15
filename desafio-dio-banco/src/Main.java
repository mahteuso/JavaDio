public class Main {
    public static void main(String[] args) {

        Client mateus = new Client("Mateus Laranjeira", 234981232);
        Client jullia = new Client("Julia Leite", 12345678);
        Client helena = new Client("Helena Dias Laranjeira", 234981232);
        Client marco = new Client("Marco Maria", 98765432);

        Account cMateus = new CurrentAccount(mateus, TypeAccount.CURRENT);
        Account cJulia = new CurrentAccount(jullia, TypeAccount.CURRENT);
        Account cHelena = new CurrentAccount(helena, TypeAccount.SAVINGS);
        Account cMarco = new CurrentAccount(marco, TypeAccount.SAVINGS);


        cMateus.draw(2000);
        cMateus.getBalance();
        cMateus.transfer(cHelena, 500);
        cHelena.getBalance();

        cMateus.getBalance();
        cMateus.cash(800);
        cMateus.getBalance();
        cMateus.transfer(cHelena, 1000);

        Account.getClients();



    }
}
