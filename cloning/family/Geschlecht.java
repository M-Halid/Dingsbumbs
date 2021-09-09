package family;

/*
 * Diese KLasse dient nur dazu, das Geschlecht von Menschen zu speichern. Man h�tte dies
 * genauso in dem Datentyp String speichern k�nnen. Auf diese Weise kann man aber besser
 * das Prinzip von flachen und tiefen Kopien zeigen.
 * 
 * Die Klasse implementiert auch Cloneable, damit ein Mensch auch tief Kopiert werden kann
 * (Daf�r muss ja auch eine Kopie der enthaltenen Unterklassen erzeugt werden)
 */
public class Geschlecht {

    private String geschlecht;
	
    // Übergibt man dem Konstruktor nicht explizit
    // ein geschlecht, so wird zufällig eins erzeugt 
    public Geschlecht() {
    
        int i = (int) (Math.random() * 2 + 1);

        if (i == 1) {
        
            geschlecht = "männlich";
        
        } else {
        
            geschlecht = "weiblich";
        }
    }
    
    public Geschlecht(String geschlecht) {
    
        this.geschlecht = geschlecht;
    }
    
    public String getGeschlecht(){
    
        return geschlecht;
    }
    
    public void geschlechtsumwandlung() {
    
        if (geschlecht.equals("männlich")) {
        
            geschlecht = "weiblich";
        
        } else {
        
            geschlecht = "männlich";
        }
    }
    
    public Geschlecht clone() {
    
        try {
        
            return (Geschlecht) super.clone(); 
        
        } catch (CloneNotSupportedException e) {
        
            // sollte nicht vorkommen da die Klasse Cloneable ist
            throw new InternalError(); 
        }
    }
}
