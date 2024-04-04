package test;


import domain.Account;

public class ThreadAccountTest01 {

    public static void main(String[] args) {

        Account account = new Account();
        Thread t1 = new Thread(account, "Mateus");
        Thread t2 = new Thread(account, "Helena");
        t1.start();
        t2.start();
    }

}
