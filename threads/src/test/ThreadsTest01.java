package test;

class ThreadsExample implements Runnable {
    private char c;

    public ThreadsExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsTest01 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadsExample('A'), "Ta");
        Thread t2 = new Thread(new ThreadsExample('B'), "Tb");
        Thread t3 = new Thread(new ThreadsExample('C'), "Tc");

        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());

    }
}
