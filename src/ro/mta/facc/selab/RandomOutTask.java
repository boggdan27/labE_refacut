package ro.mta.facc.selab;

public class RandomOutTask implements Task {
    int nr_random;
    int min = 50;
    int max=100;


    public RandomOutTask() {
        nr_random = (int)(Math.random()*(max-min+1)+min);
        this.nr_random = nr_random;

    }
    @Override
    public void execute()
    {
        System.out.println(nr_random);
    }
}
