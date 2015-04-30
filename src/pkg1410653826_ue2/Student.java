package pkg1410653826_ue2;

public class Student extends MenschDrei{
    
    int matrikelnummer;
    String studiengang;
    
    
    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
        
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um einen Studenten, er heisst " + vorname + " " + nachname + " und ist " + alter + " Jahre alt... Matrikelnummer: " + matrikelnummer + ", Studiengang: " + studiengang);
    }
    public static void main(String[] args) {
        MenschDrei mensch1 = new MenschDrei("Max", "Musterboy", 18);
        mensch1.Status();
        
        mensch1 = new Student ("Max", "Musterboy", 18, 1410666666, "WEB14");
        mensch1.Status();
        
    }
}
