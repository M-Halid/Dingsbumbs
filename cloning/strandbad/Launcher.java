package strandbad;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        // Create domain model.
        StrandBad sb = new StrandBad();
        
        sb.pool = new Pool();
        sb.liegeStuhlVerleih = null;
        sb.eisCafe = null;
        sb.angestellte = new ArrayList<Person>();

        BadeMeister b = new BadeMeister();
        Rettungsschwimmer r = new Rettungsschwimmer();
        
        sb.angestellte.add(b);
        sb.angestellte.add(r);
    
        // Clone domain model using "clone" method.
        StrandBad sb2 = null;
        
        try {
        
            sb2 = (StrandBad) sb.clone();
        
        } catch (CloneNotSupportedException e) {
        
            e.printStackTrace();
        }

        System.out.println("The original domain model contains these values:");
        System.out.println("Pool: " + sb.pool);
        System.out.println("Liegestuhlverleih: " + sb.liegeStuhlVerleih);
        System.out.println("Eiscafe: " + sb.eisCafe);
        System.out.println("Angestellte: " + sb.angestellte);

        System.out.println("The cloned domain model contains these values:");
        System.out.println("Pool: " + sb2.pool);
        System.out.println("Liegestuhlverleih: " + sb2.liegeStuhlVerleih);
        System.out.println("Eiscafe: " + sb2.eisCafe);
        System.out.println("Angestellte: " + sb2.angestellte);
    }
}
