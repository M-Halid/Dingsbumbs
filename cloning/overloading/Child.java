package overloading;

/**
 * Overload a method.
 */
class Parent {

    public void method() {
        System.out.println("Test Parent");
    }
}

public class Child extends Parent {

    // The same method name, but different parameter types.
    public void method(int i) {
        System.out.println("Test Child 1");
    }

    // Yet another method name in the same class, with different number of parameters.
    public void method(int i, int j) {
        System.out.println("Test Child 2");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        c.method(5);
        c.method(5, 6);
    }
}
