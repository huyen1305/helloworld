package DataType;

import static java.lang.Integer.parseInt;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class DataType {
    int i = 0;
    static double j = 5.4;
    boolean var = true;
    static String str = "hello world";

    public static void main(String[] args) {
        System.out.println(str);
        /*
        parsing command
         */
        int var1 = Integer.parseInt("123");
        System.out.println(var1);
        double var2 = Double.parseDouble("123.2");
        System.out.println(var2);
        /*
        Math library
         */
        System.out.println(Math.min(2.3, 3.4));
    }
}
