package pkg1410653826_ue2;

abstract class Saeugetier{//abstract heisst wir haben hier eine klasse die eine funktion printAll hat diie aber noch nicht ausprogrsmmiert sein muss und nicht implementiert ist
    

        String name;
        int alter;
        String geschlecht;
        public abstract String printAll();
        
    public Saeugetier(String n, int a, String g){//Konstruktor
        name = n;
        alter = a;
        geschlecht = g;
    }
    
}
