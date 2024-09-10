package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        CalculateNumber test1 = new CalculateNumber();

        try {
            System.out.println("Average number you input: " + test1.calculateAverage());
        }catch (DivideZeroException e){
            System.out.println("You doesn't input any number");
        }


    }
}