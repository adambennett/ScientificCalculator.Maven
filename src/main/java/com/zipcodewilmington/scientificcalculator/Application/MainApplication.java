package com.zipcodewilmington.scientificcalculator.Application;

import com.zipcodewilmington.scientificcalculator.Calculator.Calculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Console.println("Welcome to my calculator!");

       String input= Console.getStringInput(  " Please enter a number to begin:");
       double inputNum = Double.parseDouble( input);
       String output= Console.getStringInput("Please select an operator;");
       double inputN = Double.parseDouble( output);


    }
}
