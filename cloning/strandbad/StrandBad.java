package strandbad;

import java.util.*;

public class StrandBad implements Cloneable {

    Pool pool;
    LiegeStuhlVerleih liegeStuhlVerleih;
    EisCafe eisCafe;
    ArrayList<Person> angestellte;

    public Object clone() throws CloneNotSupportedException {

        StrandBad sb = null;

        try {

            // Hier nicht new StrandBad(); aufrufen, da super.clone()
            // schon eine flache Kopie dieses Objektes zurückliefert!

            sb = (StrandBad) super.clone();

        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }

        // Clone references.

        if (this.pool != null) {

            sb.pool = (Pool) this.pool.clone();
        }

        if (this.liegeStuhlVerleih != null) {

            sb.liegeStuhlVerleih = (LiegeStuhlVerleih) this.liegeStuhlVerleih.clone();
        }

        if (this.eisCafe != null) {

            sb.eisCafe = (EisCafe) this.eisCafe.clone();
        }

        sb.angestellte = (ArrayList<Person>) this.angestellte.clone();

/*
        // Clone each element.
        for (Person p : this.angestellte) {

            sb.angestellte.add((Person) p.clone());
        }
*/

        // Clone each element.
        Person p = null;

        for (int i = 0; i < this.angestellte.size(); i++) {

            p = (Person) this.angestellte.get(i);

            sb.angestellte.set(i, (Person) p.clone());
        }

        return sb;
    }
}
