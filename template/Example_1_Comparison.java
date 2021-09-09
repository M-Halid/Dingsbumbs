package template;

import java.util.*;

/**
 * Mischen von Quelltext ohne und mit Generics.
 */
public class Example_1_Comparison {

    public static void main(String[] args) {

        // Ohne Generics.
        List lo = new ArrayList();

        lo.add("Hallo");

        String s = (String) lo.get(0);
        
        System.out.println("Test ohne Generics: " + s);

        // Mit Generics.
        List<String> lm = new ArrayList<String>();

        lm.add("Hallo");

        // Typumwandlung entfällt.
        s = lm.get(0);
        
        System.out.println("Test mit Generics: " + s);
    }
}
