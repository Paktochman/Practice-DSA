import java.util.Scanner;
public class productoftwonosscaler {
    public static void product (double a, double b) {
        double product = a*b;
        System.out.println("Product is:" + product);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
       // System.out.print("Enter the first number: ");
double a = sc.nextDouble();

//System.out.print("Enter the second number: ");
double b = sc.nextDouble();

        product (a,b);

        
    }
}
