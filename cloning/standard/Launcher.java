package standard;

public class Launcher {

    int testAttribute;
    
    public String toString() {

        // The following line calls the super class's
        // implementation of the "toString" method.
        String s = super.toString();

        s = "from parent class: " + s + "\n"
            + "from this class: " + getClass().getName() + "@" + Integer.toHexString(hashCode());
        
        return s;
    }

    public static void main(String[] args) {

        Launcher l = new Launcher();
        
        System.out.println("The object identification is:\n" + l);
    }
}
