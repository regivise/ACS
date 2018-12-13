import java.sql.SQLOutput;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight:");

        double weight = input.nextDouble();

        System.out.println("Enter your height:");

        double height= input.nextDouble();

        double BMI = weight / (height*height);

        System.out.println( "Your body mass index is: "+BMI);


        if (BMI<18.5){
            System.out.println("Caution your are underweight");
        }
        else if (BMI>18.5 && BMI <25){

            System.out.println("Your weight is normal");
        }
        else if(BMI>25 && BMI<30){
            System.out.println("You are overweight");
        }
        else if(BMI>30){
            System.out.println("You are obese");
        }






    }
}
