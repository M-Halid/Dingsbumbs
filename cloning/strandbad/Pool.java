package strandbad;

public class Pool implements Cloneable {

    int size;

    public Object clone() throws CloneNotSupportedException {
    
        Pool p = null;

        try {
        
            // Hier nicht new Pool(); aufrufen, da super.clone()
            // schon eine flache Kopie dieses Objektes zurückliefert!

            p = (Pool) super.clone();
    
        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }

        return p;
    }
}
