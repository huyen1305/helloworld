package ControlStatement;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class ConditionalStatement {
    /*
   if.... else
    */
    static int a = 2;
    public void testIf (int arr1) {
        if (arr1 > 5) {
            System.out.println("lon hon 5: "+arr1);
        }
        else if (arr1 == 5) {
            System.out.println("arr = : "+arr1);
        }
        else{
            System.out.println("nho hon 5: " + arr1);
        }
    }

    /*
    switch case
     */
    public void testSwitch (int arr) {
        switch (arr) {
            case 0:
                System.out.println("arr = 0");
                break;
            case 1:
                System.out.println("arr = 1");
                break;
            default:
                System.out.println("arr khac 0 va 1");
                break;
        }
    }

    public static void main(String[] args) {
        ConditionalStatement cs = new ConditionalStatement();
        cs.testIf(a);
        cs.testSwitch(a);
    }
}
