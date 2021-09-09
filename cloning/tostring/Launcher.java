package tostring;

public class Launcher {

    int peopleNumber;
    int squareMetres;

    // Each object should identify itself by overriding
    // the method "toString".

    public String toString() {
    
        // Besides a string identifier, this method should
        // return the content of the most interesting attributes.
        return getClass().getName()
            + "[anzahlPersonen = "
            + this.peopleNumber
            + ",quadratmeter = "
            + this.squareMetres
            + "]";
    }

    public static void main(String[] args) {

        Launcher l = new Launcher();

        l.peopleNumber = 1223;
        l.squareMetres = 633;

        System.out.println("Explicit call: " + l.toString());

        // The method "toString" is called implicitly (automatically, internally),
        // whenever the methods "print" or "println" are called
        // with an object reference as argument.
        System.out.println("Implicit call: " + l);

        // Likewise, "toString" is called when using the string
        // operator "+" with an object reference as argument.
    }
}
