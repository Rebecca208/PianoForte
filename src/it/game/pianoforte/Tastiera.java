package it.game.pianoforte;

import java.util.ArrayList;
import java.util.List;

public class Tastiera {
    private List<Tasto> tasti;
    public Tastiera(int note){
        tasti = new ArrayList<>();
        for(int j=0;j<note;j++){
            tasti.add(new Tasto());
        }
    }
    public List<Tasto> getTasti() {
        return tasti;
    }
    public void gestisciInput(int indice, boolean premuto){
        tasti.get(indice).setPremuto(premuto);
    }
}
