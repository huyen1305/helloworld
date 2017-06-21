package Function;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class Addition {
    public int add (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(3,4));
    }
}
