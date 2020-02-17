package Arrays;

public class lesson1 {


    public static void main(String[] args) {


        // task 1
        int a = 23;
        double b = 23.2;
        byte c = 1;
        short v = 2342;
        long n = 989734623l;
        float m = 987293466f;
        char x = 46;
        boolean t = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(v);
        System.out.println(n);
        System.out.println(m);
        System.out.println(x);
        System.out.println(t);



        // task2
        System.out.println("Byte min value " + Byte.MIN_VALUE);
        System.out.println("Byte max value " + Byte.MAX_VALUE);
        System.out.println("Int min value " + Integer.MIN_VALUE);
        System.out.println("Int max value " + Integer.MAX_VALUE);
        System.out.println("Short min value " + Short.MIN_VALUE);
        System.out.println("Shortmax value " + Short.MAX_VALUE);
        System.out.println("Long min value " + Long.MIN_VALUE);
        System.out.println("Long max value " + Long.MAX_VALUE);
        System.out.println("Float min value " + Float.MIN_VALUE);
        System.out.println("Float max value " + Float.MAX_VALUE);
        System.out.println("Double min value " + Double.MIN_VALUE);
        System.out.println("Double max value " + Double.MAX_VALUE);

        System.out.println("Char min value " + Character.MIN_VALUE);
        System.out.println("Char max value " + Character.MAX_VALUE);
        System.out.println("Boolean min value " + Boolean.TRUE);
        System.out.println("Boolean max value " + Boolean.FALSE);



        //task3
        int[] array = {32, 534, 1345, 2,  6245, 56, 624};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            while (min > array[i]) {
                min = array[i];
                array[i] = array[i + 1];
            }
        }
        System.out.println("array's min value is " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            while (max < array[i]) {
                max = array[i];
                array[i] = array[i+1];
            }
        }
        System.out.println("array's maximum value is " + max);

    }
}
