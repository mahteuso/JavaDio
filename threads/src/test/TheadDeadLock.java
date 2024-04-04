package test;

public class TheadDeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r = () -> {
          synchronized (lock1) {
              System.out.println("Thread 1: Segurando o lock de lock1");
              System.out.println("Thread 1: Esperando o lock de lock2");
              synchronized (lock2){
                  System.out.println("Thread 2: Esperando o lock de Lock1");
              }
          }
        };

        Runnable x = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: Segurando o lock de lock2");
                System.out.println("Thread 2: Esperando o lock de lock1");
                synchronized (lock1){
                    System.out.println("Thread 1: Esperando o lock de Lock2");
                }
            }

        };

        new Thread(r).start();
        new Thread(x).start();
    }
}
