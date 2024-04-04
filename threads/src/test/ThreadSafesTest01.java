package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadNames implements Runnable{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());
    public  void add(String name){
        names.add(name);

    }

    public void removeFirst(){
        if (!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }

    @Override
    public void run() {
        add("Mateus");
        add("Helena");
        removeFirst();
        removeFirst();
    }
}

public class ThreadSafesTest01 {


    public static void main(String[] args) {
        ThreadNames thr = new ThreadNames();
        new Thread(thr, "thr1").start();

        Thread dois = new Thread(thr, "thr2");
        dois.getPriority();
        dois.start();


    }
}
