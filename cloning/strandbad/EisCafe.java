package strandbad;

public class EisCafe implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
    
        EisCafe c = null;

        try {
        
            // Hier nicht new EisCafe(); aufrufen, da super.clone()
            // schon eine flache Kopie dieses Objektes zurückliefert!

            c = (EisCafe) super.clone();
    
        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }

        return c;
    }
}
