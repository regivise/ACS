
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorCirc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

       System.out.println("The circumference of the circle is " + new DecimalFormat("0.00").format(calc(radius)));

    }
    public static double calc(double r){

        double radius=r;

        double circumference = Math.PI * radius *radius;


        return circumference ;
    }
}
