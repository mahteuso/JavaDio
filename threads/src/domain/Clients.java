package domain;

import java.util.PriorityQueue;
import java.util.Queue;


public class Clients {
    private final Queue<String> emails = new PriorityQueue<>();

    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }

    public void addEmail(String email) {
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " adiconou o email: " + email + " na caixa de email");
            emails.add(email);
            pollEmail();
            emails.notifyAll();
            System.out.println(Thread.currentThread().getName() + " enviou o email: " + email);
        }
    }

    public void pollEmail() {
        emails.poll();
    }

    public void retrieveEmail() {
        System.out.println(Thread.currentThread().getName() + " está verificando se há algum email");
        while (isOpen()) {
            synchronized (emails) {
                String email1 = "julia@Estado.br";
                String email2 = "mateus@ufscar.br";
                addEmail(email1);
                addEmail(email2);
            }
            if (emails.isEmpty()) {
                close();
                System.out.println(Thread.currentThread().getName() + " enviou o último email.");
                break;
            }
            System.out.println(Thread.currentThread().getName() + " Está esperando para poder enviar um email");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " verificou que não há mais emails");

    }

    public void close() {
        this.open = false;
    }
}
