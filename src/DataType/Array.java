package DataType;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class Array {
    String[] fruits = {"apple", "grape", "lime", "orange"};


    public static void main(String[] args) {
        double[] number = new double[10];
        for (int i=0; i<10; i++) {
            number[i] = Math.random();
            System.out.println(number[i]);
        }
    }
}
