class ThreadsExample implements Runnable{
    private char c;

    public ThreadsExample( char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++){
            System.out.print(c);
        }
    }
}

public class ThreadsTest01 {

    public static void main(String[] args) {

            Thread t1 = new Thread(new ThreadsExample('A'));
            Thread t2 = new Thread(new ThreadsExample('B'));
            Thread t3 = new Thread(new ThreadsExample('C'));

            t1.run();
            t2.start();
            t3.run();

    }
}
