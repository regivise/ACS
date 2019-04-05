import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter name to search: ");
        String keyboard =input.next();

        String[] names={"Mike","Ken", "Suzie","Reginald"};

        for (int count=0; count<names.length;count++){
            //System.out.println(names[count]);

            if(names[count].equals(keyboard)){
                    System.out.println(keyboard +" is found");
        }
        else{
                System.out.println(keyboard + " is not found");
            }



    }}}





