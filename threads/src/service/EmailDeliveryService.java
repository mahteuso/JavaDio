package service;

import com.sun.security.jgss.GSSUtil;
import domain.Members;

public class EmailDeliveryService implements Runnable {
    private final Members member;

    public EmailDeliveryService(Members member) {
        this.member = member;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Iniciando a entrega de emails");
        while (member.isOpen() || member.pedingEmails() > 0) {
            try {
                member.retrieveEmail();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
