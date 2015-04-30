package pkg1410653826_ue2;

public class Mensch extends Saeugetier{
    
    public Mensch(String n, int a, String g){
        super(n, a, g);
    }
    public String printAll(){
        return name + "#" + alter + "#" + geschlecht;
    }
    public static void main(String[] args) {
        Mensch Italiener = new Mensch ("Luigi", 26, "männlich");
        System.out.println(Italiener.printAll());
    }
}
