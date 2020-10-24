package ro.mta.facc.selab;



public class CounterOutTask implements Task{
    Clasa_globala s = new Clasa_globala();

    public CounterOutTask() {
        s.counter+=1;

    }

    @Override
    public void execute(){

        System.out.println(s.counter);
    }
}
