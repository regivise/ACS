package com.company;
import java.util.*;

public class Randomizer {
    public static void main(String[] args) {

        int number1 = (int)(System.currentTimeMillis() % 100);
        int number2 = (int)(System.currentTimeMillis() / 7 % 100);


        Scanner input =new Scanner(System.in);
        System.out.println("What is "+number1+" + "+number2+" = ");
        int answer=input.nextInt();


        if (number1+number2==answer){
            System.out.println("Correct, you are a genius! ");
        }
        else{
            System.out.println("Wrong answer, try again.");
        }
}}
