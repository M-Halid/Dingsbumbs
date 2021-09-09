package overriding;

/**
 * Override a method.
 */
class Parent {

    public void method() {
        System.out.println("Test Parent");
    }
}

public class Child extends Parent {

    public void method() {
        // If functionality of super class's "method" is needed,
        // it has to be called explicitly with:
        // super.method();
        System.out.println("Test Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
