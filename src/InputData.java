import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class InputData {


    public static void main(String[] args) throws IOException {
        /*
        Scanner class
         */
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number: ");
        int i = reader.nextInt();
        System.out.println("result: "+i);

        /*
        BufferReader
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a name: ");
        String name = br.readLine();
        System.out.println("hello " + name);
    }
}
