import java.util.Scanner;
import javax.swing.*;
public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter content: ");
        String content = input.next();
        JOptionPane.showMessageDialog(null, content);
        System.out.println(3^4);
    }}