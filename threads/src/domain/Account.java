package domain;

public class Account implements Runnable{
    private double balance = 50;

    public void withdraw(double amount){
        if (this.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está sacando R$" + amount);
            this.balance = this.balance - amount;
            System.out.println(Thread.currentThread().getName() + " seu saldo é R$" + this.getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + " Você não tem saldo sufuciente para essa operação, seu saldo R$" + this.getBalance());
        }

    }
    public double getBalance() {
        return balance;
    }

    @Override
    public void run() {
        double amount = 10;
        for (int i = 0; i < 5; i++) {
            withdraw(amount);
            if (this.getBalance() < amount){
                System.out.println("ferrou");
            }
        }
    }
}
