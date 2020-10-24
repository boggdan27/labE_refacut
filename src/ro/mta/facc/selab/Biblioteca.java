package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Biblioteca {
    private ArrayList<Carte> Carti ;

    public Biblioteca() {
        Carti = new ArrayList<Carte>();
    }

    public void addCarti(Carte c)
    {
        Carti.add(c);
    }

    public void sort()
    {
        Collections.sort(Carti);
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append("Biblioteca contine:\n ");

        for(Carte c:Carti)
        {
            builder.append(c);
            builder.append("\n");
        }
        return builder.toString();
    }


    public Biblioteca add(Biblioteca aux){
        Biblioteca c = new Biblioteca();
        c.Carti = this.Carti;

        for(Carte s:aux.Carti)
        {
            int cnt =0;
            for(Carte i:this.Carti)
            {
                if(i.get_autor() == s.get_autor() && i.get_titlu() == s.get_titlu())
                {
                    cnt = 1;
                }
            }

            if(cnt == 0)
            {
                c.addCarti(s);
            }
        }

        return c;
    }

}
