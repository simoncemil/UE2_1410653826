package Aufgabe4;

public class Fahrzeug {
    private short Reifen;
    private String Farbe;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl;
    public void starten(){
        Gestartet = true;
    }
    public void stoppen(){
        Gestartet = false;
    }
    public void beschleunigen(short g){
        if (Gestartet = true){
            Geschwindigkeit += g;
        }
        if (Geschwindigkeit > 250){
            Geschwindigkeit = 250;
        }
    }
    public void bremsen(short b){
        if (Gestartet = true){
            Geschwindigkeit -= b;
        }
        if (Geschwindigkeit < 0){
            Geschwindigkeit = 0;
        }
    }
//    private boolean Klimaanlage;
////  private short Airbags;
//    
//    public void klimaanlageAn(){
//        if (Klimaanlage = false){
//            Klimaanlage = true;
//        }
//        else{
//            System.out.println("Die Klimaanlage läuft bereits");
//        }
//    }
//    
//    public void klimaanlageAus(){
//        if (Klimaanlage = true){
//            Klimaanlage = false;
//        }
//        else{
//            System.out.println("Klimaanlage bereits aus");
//        }
//    }
    

    public short getReifen() {
        return Reifen;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String Farbe) {
        this.Farbe = Farbe;
    }

    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }

//    public boolean isKlimaanlage() {
//        return Klimaanlage;
//    }
//
//    public void setKlimaanlage(boolean Klimaanlage) {
//        this.Klimaanlage = Klimaanlage;
//    }

//    public short getAirbags() {
//        return Airbags;
//    }
//
//    public void setAirbags(short Airbags) {
//        this.Airbags = Airbags;
//    }
//


    public Fahrzeug(short Reifen, String Farbe, short PS, short Tueren) {
        this.Reifen = Reifen;
        this.Farbe = Farbe;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        this.Geschwindigkeit = 0;
//        this.Klimaanlage = false;
//        this.Airbags = Airbags;
//        this.Tiefgang = Tiefgang;
//        this.Schrauben = Schrauben;
//        this.Ladung = Ladung;
    }
    
    
    
    
    
}