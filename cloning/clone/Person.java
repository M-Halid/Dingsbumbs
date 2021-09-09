package clone;

public class Person implements Cloneable {

    String name;
    int age;

    public Object clone() throws CloneNotSupportedException {

        Person p = (Person) super.clone();

        // Shallow: Values and references are copied
        // inside "clone" method "java.lang.Object".
        // Deep: The content of referenced objects
        // has to be copied manually here!

        return p;
    }

    public static void main(String[] args) {

        Person susi = new Person();
        susi.name  = "Susi";
        susi.age = 29;
        
        try {

            Person uschi = (Person) susi.clone();
            uschi.name  = "Uschi";
            
            System.out.println(uschi.name + " is " + uschi.age + " years old.");

        } catch (CloneNotSupportedException ex) {

            // This should not happen, since this object is coneable.
            throw new InternalError();
        }
    }
}
