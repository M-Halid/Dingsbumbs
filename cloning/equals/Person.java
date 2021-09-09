package equals;

public class Person {

    String name = "Max";
    int age = 20;

    @Override
    public boolean equals(Object o) {

        boolean r = false;

        // CAUTION! Compare classes before casting the types below!
        // CAUTION! The "instanceof" operator may NOT be used here,
        // since it also returns "true" for sub classes of this class,
        // while in reality objects of this class and a sub class are unequal!
        // Therefore, use the "getClass" method to compare types!
        if (this.getClass().equals(o.getClass())) {

            Person l = (Person) o;

            if (this.name.equals(l.name) && (this.age == l.age)) {

                r = true;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        Person o1 = new Person();
        Person o2 = o1;

        if (o1 == o2) {
            System.out.println("Comparison result: o1 == o2");
        } else {
            System.out.println("Comparison result: o1 != o2");
        }

        if (o1.equals(o2)) {
            System.out.println("Comparison result: o1 equals o2");
        } else {
            System.out.println("Comparison result: o1 is not equal to o2");
        }

        Person o3 = new Person();

        if (o1 == o3) {
            System.out.println("Comparison result: o1 == o3");
        } else {
            System.out.println("Comparison result: o1 != o3");
        }

        if (o1.equals(o3)) {
            System.out.println("Comparison result: o1 equals o3");
        } else {
            System.out.println("Comparison result: o1 is not equal to o3");
        }
        
        // If the "equals" method is not overridden, then
        // the comparison o1.equals(o3) returns false.
        // This is because the "equals" method of "java.lang.Object"
        // is called and returns the class name and hashcode,
        // which is unequal for each separate object.
    }
}
