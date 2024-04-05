package domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pedingEmails() {
        synchronized (emails) {
            return emails.size();
        }

    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Adicionando email na lista");
            emails.add(email);
            emails.notifyAll();
        }
    }

    public void retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " Checando se term emails");
        synchronized (emails) {
            while (open) {
                if (emails.isEmpty()) break;
                System.out.println(Thread.currentThread().getName() + " Esperando liberação de email");
                try {
                    System.out.println(Thread.currentThread().getName() + " Esperando email, entrando em modo de espera");
                    emails.wait();
                    String email = emails.poll();
                    System.out.println(Thread.currentThread().getName() + " Acabou de recolher o email" + email);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void close() {
        open = false;
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando a todos que não estamos mais pegando emails");
        }
    }
}
