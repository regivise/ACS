import java.util.Scanner;

public class AreaMeth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius=scan.nextDouble();
        System.out.println("The area is: "+ calc(radius));

        scan.close();
    }
    public static double calc(double r){
        //r double is the method parameter
        //rad double is the method radius.

        double rad=r;
        rad= Math.PI*(rad*rad);

    return rad;
    }

}


