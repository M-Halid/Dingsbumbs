package strandbad;

public class Person implements Cloneable {

    String name;

    public Object clone() throws CloneNotSupportedException {
    
        Person p = null;

        try {
        
            // Hier nicht new Person(); aufrufen, da super.clone()
            // schon eine flache Kopie dieses Objektes zurückliefert!

            p = (Person) super.clone();
    
        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }

        return p;
    }
}
