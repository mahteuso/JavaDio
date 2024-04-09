package domain;

import javax.swing.*;
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
            emails.add(email);
            System.out.println(Thread.currentThread().getName() + " Adicionou email: " + email + " na lista");
            emails.notifyAll();
        }
    }

    public String emailSend(){
        return emails.poll();
    }
    public void retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " Checando se têm emails");
        synchronized (emails) {
            while (open) {
                if (emails.isEmpty()) {
                    String email = "Julia@ufscar.br";
                    addMemberEmail(email);
                    String name = emailSend();
                    System.out.println(Thread.currentThread().getName() + " enviou o email: " + name );
                    if (emails.isEmpty()) {
                        close();
                        break;
                    }
                }
                System.out.println(Thread.currentThread().getName() + " Esperando liberação de email");
                try {
                    System.out.println(Thread.currentThread().getName() + " Esperando email, entrando em modo de espera");
                    emails.wait();

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
