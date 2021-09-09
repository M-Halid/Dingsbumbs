package strandbad;

public class LiegeStuhlVerleih implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
    
        LiegeStuhlVerleih v = null;

        try {
        
            // Hier nicht new LiegeStuhlVerleih(); aufrufen, da super.clone()
            // schon eine flache Kopie dieses Objektes zurückliefert!

            v = (LiegeStuhlVerleih) super.clone();
    
        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }

        return v;
    }
}
