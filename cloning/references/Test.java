package references;

/**
 * Passing references.
 */
public class Test {

    public static void method(Test a) {

        System.out.println("a inside method(): " + a);
    }

    public static void main(String[] args) {

        Test t = new Test();

        System.out.println("t inside main(): " + t);

        method(t);
    }
}
