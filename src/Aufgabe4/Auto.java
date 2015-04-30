package Aufgabe4;

public class Auto extends Fahrzeug implements Comparable<Auto>{//implement ein interface, dann gibts abstrakte methoden die implementiert werden müssen und non-abstract methoden die override werden müssen
        private short Airbags;
        private boolean Klimaanlage;

    public Auto(short Reifen, String Farbe, short PS, short Tueren, short Airbags) {
        super(Reifen, Farbe, PS, Tueren);
        this.Airbags = Airbags;
        Klimaanlage = false;
        Anzahl ++;
    }
        

//  private short Airbags;
    
    public void klimaanlageAn(){
        if (Klimaanlage = false){
            Klimaanlage = true;
        }
        else{
            System.out.println("Die Klimaanlage läuft bereits");
        }
    }
    
    public void klimaanlageAus(){
        if (Klimaanlage = true){
            Klimaanlage = false;
        }
        else{
            System.out.println("Klimaanlage bereits aus");
        }
    }
    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }
    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }

/*    @Override
    public String toString() {
        return "Das Auto hat " + getPS() + " und fährt mit " + getGeschwindigkeit() + "kmh";
    }*/

    @Override
    public int compareTo(Auto b) {//man darf in die Klammer kein Fahrzeug f reinschreiben weil man es sonst nichtmehr überschreiben würde... folglich wäre es dann auch kein compareTO mehr
        
        if(this.getPS()< b.getPS())
        {
            return 1;
        }
        else if(this.getPS()>b.getPS())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
