package ro.mta.facc.selab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Carte c = new Carte("Biblia pierduta","Igor Bergler",2017,600);
        Biblioteca b = new Biblioteca();
        b.addCarti(c);
        b.addCarti(new Carte("Invitatie la vals","Mihail Drumes",1910,250));
        b.addCarti(new Carte("Amintiri din copilarie","Ion Creanga",1880,80));

        b.addCarti(new Carte("moara cu noroc","Victor slavici",1920,199));
        b.sort();
        System.out.println(b.toString());

        Biblioteca d = new Biblioteca();
        d.addCarti(new Carte("Invitatie la vals","Mihail Drumes",1910,250));
        d.addCarti(new Carte("Harap Alb","Ion Creanga",1881,100));

        Biblioteca f = new Biblioteca();
        f=d.add(b);

        f.sort();
        System.out.println(f.toString());

        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("alt thread");
            }
        }).start();


/*
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask());
        tasks.add(new OutTask());
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());

        for(Task j:tasks)
            j.execute();
*/

    /*    MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyRunnable thr= new MyRunnable();
        thr.run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("alt thread");
            }
        }).start();*/
    }
}
