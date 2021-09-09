package aliasing;

/**
 * Use aliases as references.
 */
public class Test {

    private int i;

    public Test(int ii) {

        i = ii;
    }

    public static void main(String[] args) {

        Test x = new Test(7);
        // Assign the reference to
        // another local variable (alias).
        Test y = x;

        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
        System.out.println("Incrementing x");

        x.i++;

        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
    }
}
