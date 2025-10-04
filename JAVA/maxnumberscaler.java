import java.util.Scanner;
public class maxnumberscaler {

    public static void maxofthetwo (int a, int b) {
        if (a>b) {
            System.out.println(a);

        }
        else if (b>a) {
            System.out.println(b);
        }
        else {
            System.out.println("Both 'a' and 'b' are equal: " + a);
           
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter a:");
        int a = sc.nextInt();
        System.out.println ("Enter b:");
        int b = sc.nextInt();

        maxofthetwo (a, b);

    }
    
}
