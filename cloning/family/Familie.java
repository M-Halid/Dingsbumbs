package family;

import java.util.*;

/* Die Klasse Familie erzeugt eine Familie bestehend aus einem Vater, einer Mutter,
 * einem Liebhaber der Mutter und 'anzahlKinder' Kinder, die mit einer wahrscheinlichkeit
 * von 1/3 nicht vom Vater, sondern vom Liebhaber abstammen.
 */
public class Familie {

    private final int anzahlKinder = 11;
    private Mensch vater;
    private Mensch mutter;
    private Vector<Mensch> kinder;

    public Familie() {
    
        // Eltern erzeugen
        vater = new Mensch("blau", "braun", "männlich");
        mutter = new Mensch("blau", "blond", "weiblich");
        
        // Liebhaber erzeugen
        Mensch lover = new Mensch("braun", "schwarz", "männlich");
        
        // Kinder erzeugen
        kinder = new Vector<Mensch>();

        for(int i = 0; i<anzahlKinder; i++){
        
            int unfall = (int) (Math.random()*3+1);
            
            if (unfall == 3) {
                
                kinder.add(new Mensch(lover, mutter));
                
            } else {
            
                kinder.add(new Mensch(vater, mutter));
            }
        }
    }
    
    // Familie komplett mit allen Eigenschaften ausgeben
    public void printFamilie(){

        System.out.println("Vater: " + vater.toString());
        System.out.println("Mutter: " + mutter.toString());
        
        for (int i = 0; i < kinder.size(); i++) {
            
            System.out.println("Kind " + (i+1) + ": " + kinder.get(i).toString());
        }
    }
    
    // Vater überprüft Kinder optisch
    public void checkKinder() {
    
        System.out.println("\nKinder die optisch nicht vom Vater sein k�nnen:");

        for (int i = 0; i < kinder.size(); i++) {
        
            if (!vater.equals(kinder.get(i))) {
            
                System.out.println("Kind " + (i + 1) + " (" + kinder.get(i).toString() + ")");
            }
        }
    }
    
    // Vater überprüft Kinder genetisch
    public void gentest() {
    
        System.out.println("\nKinder die genetisch nicht vom Vater sind:");
        
        for (int i = 0; i < kinder.size(); i++) {
        
            if (!vater.equalsGenetisch(kinder.get(i))) {
            
                System.out.println("Kind " + (i + 1) + " (" + kinder.get(i).toString() + ")");
            }
        }
    }
}
