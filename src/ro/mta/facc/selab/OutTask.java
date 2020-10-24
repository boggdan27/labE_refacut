package ro.mta.facc.selab;

public class OutTask implements Task{
    String mesaj;

    public OutTask() {
        String msj = "Am inceput taskul.";

        this.mesaj = msj;

    }

    @Override
    public void execute(){
        System.out.println(mesaj.toString());
    }
}
