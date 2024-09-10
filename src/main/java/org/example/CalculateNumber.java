package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CalculateNumber {
    List<Integer> inputArray ;
    double average;

    public CalculateNumber() {
        this.inputArray = new ArrayList<>();
        this.average = 0;
    }

    public double calculateAverage() throws DivideZeroException {
        InputScanner input = new InputScanner();
        boolean isFinish = false;
        int countInteger = 0;
        double sumDouble= 0;
        double inputDouble;
        while(!isFinish){
            String inputUser = input.getStringInput("Insert number or q to exit the program: ");
            if(inputUser.equals("q")){
                isFinish=true;
                if(countInteger==0){
                    throw new DivideZeroException("No Number inputted");
                }
                else{
                    return sumDouble/countInteger;
                }
            }
            else {
                try {
                    inputDouble = Double.parseDouble(inputUser);
                } catch (NumberFormatException e) {
                    System.out.println("Please valid enter number or 'q' to finish");
                    continue;
                }
                sumDouble += inputDouble;
                countInteger++;
            }

        }
        return sumDouble/countInteger;
    }
}
