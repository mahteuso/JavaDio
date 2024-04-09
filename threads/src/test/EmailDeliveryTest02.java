package test;

import service.EmailDelivery;

public class EmailDeliveryTest02 {
    public static void main(String[] args) {
        EmailDelivery email = new EmailDelivery();
        Thread mateus = new Thread(email, "Mateus");
        Thread julia = new Thread(email, "Julia");

        mateus.start();
        julia.start();
    }
}
