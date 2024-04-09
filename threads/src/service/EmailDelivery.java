package service;

import domain.Clients;

public class EmailDelivery implements Runnable{
     private final Clients client = new Clients();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " vai olhar a caixa de emails");
        client.retrieveEmail();
    }
}
