package template;

import java.util.*;

public class Example_3_2_GenericMethod {

    static <T> int findIndex(List<T> l, T o) {

        int i = -1;

        for (int j = 0; j < l.size(); j++) {

            if (l.get(j).equals(o)) {

                i = j;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        List<Double> dd = new ArrayList<Double>();

        // Autoboxing converts primitive "double" values to "Double".
        dd.add(1.2);
        dd.add(2.3);
        dd.add(3.4);
        dd.add(4.5);

        int i = findIndex(dd, 3.4);

        System.out.println(i);
    }
}
