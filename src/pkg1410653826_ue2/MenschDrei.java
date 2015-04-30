package pkg1410653826_ue2;
//Eine Methode ist polymorph, wenn sie in verschiedenen Klassen die gleiche Signatur hat, jedoch erneut implementiert ist.
//--> gleicher Kopf, unterschiedlicher Körper
public class MenschDrei {
    String vorname;
    String nachname;
    int alter;

    public MenschDrei(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public void Status(){
        System.out.println("Es handelt sich um einen Menschen, er heisst " + vorname + " " + nachname + " und ist " + alter + " Jahre alt");
    }
}
