package ro.mta.facc.selab.Exercise2;

import ro.mta.facc.selab.Task;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<Thread>();

        System.out.println("Thread name " + Thread.currentThread().getName());

        int j = 1;

        for (int i = 0; i < 9; i++) {
            Thread t = new Thread();
            t.setName(""+j);
            j++;
            t.start();
            threads.add(t);
        }

        for( Thread s:threads)
        {
            System.out.println(s.getName());
        }
    }
}
