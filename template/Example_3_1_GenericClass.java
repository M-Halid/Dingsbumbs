package template;

class MeineGenerischeKlasse<T> {

    private T attribut;

    T getAttribut() {

        return attribut;
    }

    void setAttribut(T attribut) {

        this.attribut = attribut;
    }
}

public class Example_3_1_GenericClass {

    public static void main(String[] args) {

        MeineGenerischeKlasse<Double> c = new MeineGenerischeKlasse<Double>();

        c.setAttribut(new Double(3.14));

        // Typumwandlung nicht nötig.
        Double d = c.getAttribut();

        System.out.println(d + " (" + c.getAttribut().getClass() + ")");
    }
}
