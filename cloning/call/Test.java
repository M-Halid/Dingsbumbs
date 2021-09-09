package call;

class Account {

    double balance = 1000;
}

/**
 * Call by Value and by reference.
 */
public class Test {

    static void test(double v, Account a) {
        v = v + 100.0;
        a.balance = a.balance + 100.0;
    }

    public static void main(String[] args) {

        Account a = new Account();
        double value = 1000.0;

        System.out.println("Before: Value=" + value + " Balance=" + a.balance);
        Test.test(value, a);
        System.out.println("After: Value=" + value + " Balance=" + a.balance);
    }
}
