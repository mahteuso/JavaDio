package test;

import domain.Members;
import service.EmailDeliveryService;

public class emailDeliveryTest01 {
    public static void main(String[] args) {
        EmailDeliveryService email = new EmailDeliveryService(new Members());

        Thread t1 = new Thread(email, "Mateus");
        Thread t2 = new Thread(email, "Julia");

        t1.start();
        t2.start();
    }
}
