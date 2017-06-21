package ControlStatement;

/**
 * Created by thanh huyền on 21-Jun-17.
 */
public class LoopStatement {
    /*
    For
     */
    public void testFor(int n) {
        for (int i=0; i<n; i++) {
            System.out.println(i);
        }
    }
    /*
    while
     */
    public void testWhile() {
        int j=1;
        while (j<5) {
            System.out.println(j);
            j++;
            if (j == 2) {
                break;
            }
        }
    }
    /*
    do ... while
     */
    public void testDoWhile() {
        int k=0;
        do {
            System.out.println(k);
            k++;
        }while (k != 3);
    }

    public static void main(String[] args) {
        LoopStatement ls = new LoopStatement();
        ls.testDoWhile();
        ls.testFor(3);
        ls.testWhile();
    }
}
