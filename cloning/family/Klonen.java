package family;

public class Klonen {

    private Mensch vater;
    private Mensch mutter;
    private Mensch kind;
    private Mensch klonFlach;
    private Mensch klonTief;
	
    public Klonen(){

        //Eltern und Kind erzeugen
        vater = new Mensch("blau", "braun", "männlich");
        mutter = new Mensch("blau", "blond", "weiblich");
        kind = new Mensch(vater, mutter);
        
        //das kind wird jetzt einmal flach und einmal tief geklont 
        //klonFlach = kind.clone();
        klonTief = kind.cloneDeep(kind);
        
        // um jetzt den Unterschied zu zeigen,
        // werden Eigenschaften des Originalkindes ver�ndert
        kind.getGeschlecht().geschlechtsumwandlung();
    }

    public void printFamilie(){

        System.out.println("Vater: " + vater.toString());
        System.out.println("Mutter: " + mutter.toString());
        System.out.println("Kind : " + kind.toString());
        System.out.println("KlonFlach : " + klonFlach.toString());
        System.out.println("KlonTief : " + klonTief.toString());
    }
}
