import java.util.Scanner; // Import the Scanner class

public class sumscaler {

    public static int sumscaler(int x, int y) {
         int sum = 0;
         sum = x + y;
         return sum;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fist number (interger):");

        int n = sc.nextInt();

        System.out.println("Enter the second number (interger):");

        int p = sc.nextInt();



        System.out.println("Sum of the two integers:" + sumscaler (n,p));



    }

    
}
