package template;

import java.util.*;

/**
 * Mischen von Quelltext ohne und mit Generics.
 */
public class Example_2_Mixing {

    public static void main(String[] args) {

        // Die typisierte Liste.
        List<String> t = new ArrayList<String>();
        // The normale Liste.
        List n = t;

        // Typvergleich liefert "true".
        System.out.println(t.getClass() == n.getClass());

        // Kein Compilier-Fehler, obwohl Liste
        // eigentlich Strings enthalten soll.
        n.add(new Integer(42));

        // ClassCastException zur Laufzeit,
        // da Wert vom Typ "Integer" zurück geliefert.
        String s = t.get(0);
    }
}
