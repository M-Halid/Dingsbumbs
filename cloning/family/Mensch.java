package family;

public class Mensch {

    private String augenfarbe;
    private String haarfarbe;
    private Mensch mutter;
    private Mensch vater;
    private Geschlecht geschlecht;

    // erzeugt Menschen ohne Eltern. Achtung: bei Zugriff auf Eltern Laufzeitfehler!
    public Mensch(String Augenfarbe, String Haarfarbe, String Geschlecht) {

        // TODO die �bergebenen Werte zuordnen
    }
    
    //erzeugt Menschen mit Eltern und den Merkmalen der Eltern
    public Mensch(Mensch v, Mensch m) {
        
        this.vater = v;
        this.mutter = m;
        this.geschlecht = new Geschlecht();

        // TODO schreibe die Methode private void genmix()
        genmix();
    }
    
    public Geschlecht getGeschlecht() {

        return this.geschlecht;
    }
    
    public String getAugenfarbe() {
    
        return this.augenfarbe;
    }
    
    public void setAugenfarbe(String a) {
        
        this.augenfarbe = a;
    }
    
    public String getHaarfarbe() {
    
        return this.haarfarbe;
    }
    
    public void setHaarfarbe(String h) {
    
        this.haarfarbe = h;
    }
    
    //�bergibt dem Kind zuf�llig entweder Eigenschaften der Mutter oder des Vaters
    private void genmix() {
    
        // TODO zuf�llig die Haarfarbe und Augenfarbe von Mutter oder Vater �bernehmen.
    }
    
    //�berschreibt die toString Methode
    public String toString() {
    
        return "Geschlecht: " + geschlecht.getGeschlecht() + "| Augenfarbe: " + augenfarbe + "| Haarfarbe: " + haarfarbe;
    }
    
    //equals Methode �berschreiben ("optisch")
    public boolean equals(Object o) {

        // TODO optische Merkmale vergleichen
        return true;
    }
    
    //genaueres equals ("genetisch")
    public boolean equalsGenetisch(Object o) {

        // TODO genetische Merkmale vergleichen
        return true;
    }
    
    //gibt eine tiefe Kopie zur�ck
    public Mensch cloneDeep(Mensch original) {
    
        try {
        
            //kopiert die aufrufende Klasse (das Original) flach
            Mensch klon = (Mensch) super.clone();
            //TODO Mutter, Vater und Geschlecht clonen
            
            //Die tiefe Kopie ist fertig und kann zur�ck gegeben werden
            return klon;
        
        } catch (CloneNotSupportedException e) {
        
            // sollte nicht vorkommen da die beteiligten Klassen
            // (Mensch, Geschlecht) Cloneable sind
            throw new InternalError();
        }
    }
}
