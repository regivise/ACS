package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class Main {
    public static void newLine() {
        System.out.println("");}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        BigDecimal balance = new BigDecimal(input.nextDouble());

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(balance));
        String test= ": ";
        newLine();
        System.out.println("P");

    }

}
