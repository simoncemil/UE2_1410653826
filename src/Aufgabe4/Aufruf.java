package Aufgabe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf {
    public static void main(String[] args) {
        Auto Kawasaki = new Auto ((short)4, "grün", (short)143, (short)1, (short)0);
        Auto Suzuki = new Auto ((short)4, "schwarz", (short)172, (short)1, (short)0);
        Auto BMW = new Auto ((short)4, "blau", (short)185, (short)1, (short)0);
        Auto Honda = new Auto ((short)4, "orange", (short)165, (short)1, (short)0);
        Auto Yamaha = new Auto ((short)4, "schwarz", (short)170, (short)1, (short)0);
        
        List<Auto> liste = new ArrayList <>();
        
        liste.add(Kawasaki);
        liste.add(Suzuki);
        liste.add(BMW);
        liste.add(Honda);
        liste.add(Yamaha);
        
        Collections.sort(liste);
        
        for(Auto a : liste) ////für jedes a wird ein element aus der arraylist liste hinzugefügt
        {
            System.out.println(a.getPS()); //soll fuer jedes Auto (a) die PS ausgeben
        }
    }
}
