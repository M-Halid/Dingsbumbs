package calculator;

import java.io.*;

public class Launcher {

    public static double add(double a, double b) {

        return a + b;
    }

    public static double subtract(double a, double b) {

        return a - b;
    }

    public static double multiply(double a, double b) {

        return a * b;
    }

    public static double divide(double a, double b) {

        return a / b;
    }

    public static double calculate(double a, double b, String o) {

        // The result.
        double r = 0.0;

        if (o.equals("add") || o.equals("+")) {

            r = add(a, b);

        } else if (o.equals("subtract") || o.equals("-")) {

            r = subtract(a, b);

        } else if (o.equals("multiply") || o.equals("*")) {

            r = multiply(a, b);

        } else if (o.equals("divide") || o.equals("/")) {

            r = divide(a, b);
        }

        return r;
    }

    public static void main(String[] args) throws IOException {

        // The operation.
        String o = "";
        // The first argument.
        double a = 0.0;
        // The second argument.
        double b = 0.0;
        // The result.
        double r = 0.0;

        // Die read() Methode liefert das Zeichen als int, also ASCII-Wert zurueck.
        // Einzelne Zeichen werden immer durch ihren ASCII-Wert repraesentiert.
        // Also sind int und char aequivalent und koennen ineinander umgewandelt werden,
        // obwohl int intern 4 Byte entspricht und char nur 1 Byte.
        // Es ist besser, die ganze Zeile mit readLine() einzulesen,
        // weil dann auch Zahlen mit mehr als nur einer Stelle korrekt gelesen werden.
        // (Die read() Methode demgegenueber liest ja immer nur EIN Zeichen,
        // also nur eine Ziffer einer Zahl.)

        //
        // A newer, more comfortable solution is to use the "Scanner" class, e.g.:
        //
        // Scanner sc = new Scanner(System.in);
        // double a = sc.nextDouble();
        //

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = "";

        System.out.println("Enter the desired operation, please: ");
        o = br.readLine();

        System.out.println("Enter the first argument, please: ");
        s = br.readLine();
        a = Double.parseDouble(s);

        // Scanner sc = new Scanner(System.in);
        // double a = sc.nextDouble();

        System.out.println("Enter the second argument, please: ");
        s = br.readLine();
        b = Double.parseDouble(s);

        r = calculate(a, b, o);

        System.out.println("The result is: " + r);
    }
}
