public class Main {
    public static void main(String[] args) {
        // Auto Boxing --> Primitive to Object....

        int x = 30;

        Integer y = Integer.valueOf(x);
        System.out.println("The value of Integer y is : " + y);

        int a = 20;
        Double b = Double.valueOf(a);
        System.out.println("The value of Double y is : " + b);

        double k = 9584.56;
        Integer l = Integer.valueOf((int) k);
        System.out.println(l);

        // Unboxing --> Object to Primitive....

        // Creating a Double object (Boxing)
        Double d = Double.valueOf(45.6);

        // Unboxing: Converting Double object to primitive double
        double primDouble = d;

        // Output the value of the primitive double
        System.out.println("Primitive double value: " + primDouble);

        Integer i = Integer.valueOf(25);
        int intValue = i;
        System.out.println(intValue);


    }
}
