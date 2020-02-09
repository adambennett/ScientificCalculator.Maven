package com.zipcodewilmington.scientificcalculator.Utilities;

import com.zipcodewilmington.scientificcalculator.Application.Console;
import com.zipcodewilmington.scientificcalculator.Calculator.Calculator;

import java.util.ArrayList;

public class Commands {

    public static String printCommands() {
    	ArrayList<String> commands = new ArrayList<>();
        commands.add("Add");
        commands.add("Subtract");
        commands.add("Pow");
        commands.add("Multiply");
        commands.add("Exponentiation");
        commands.add("Divide");
        commands.add("Inverse");
        commands.add("Invert");
        commands.add("Clear");
        commands.add("Switch mode");
        commands.add("Switch Binary");
        commands.add("Switch Octal");
        commands.add("Switch Decimal");
        commands.add("Switch Hexadecimal");
        commands.add("M+");
        commands.add("MC") ;
        commands.add("MRC");
        commands.add("Trig");
        commands.add("Sine");
        commands.add("Cosine");
        commands.add("Tangent");
        commands.add("Inverse Sine");
        commands.add("Inverse Cosine");
        commands.add("Inverse Tangent");
        commands.add("Switch trig mode");
        commands.add("Log");
        commands.add("Inverse logarithm");
        commands.add("Natural Logarithm");
        commands.add("Inverse natural logarithm");
        commands.add("Factorial");
        commands.add("Exit");
        commands.add("Display");

        String toRet = "";
        for (String s : commands) {
               toRet += s.toUpperCase() + "\n";
        }

        return toRet;
    }

    public static void prompt(Calculator calc) {
        Console.println("Please choose an operation: ");
        String input = Console.getStringInput("");
        Commands.runCommand(input, calc);
    }

    public static void runCommand(String command, Calculator calc) {
    	// local variables
        ArrayList<String> args = new ArrayList<>();
        ArrayList<Double> numArgs = new ArrayList<>();
        
        // Create an array of all input strings
        // Input is saved into arraylist called 'args'
        String[] split = command.split("\\s+");
        for (String s : split) { 
        	args.add(s); 
        }
      
        // The first string is the command, but each additional input string is likely a number
        // ie 'add 1 2 3' or 'multiply 3'
        // So we are saving each input string after the command into an array of doubles
        // This array of input numbers is called 'numArgs'
        for (int i = 1; i < args.size(); i++) {
            try {
            	numArgs.add(Double.parseDouble(args.get(i)));
            } catch (NumberFormatException e) {}
        }
        
        // Save a copy of the input command, make it lowercase
        if (args.size() > 0) {
            command = args.get(0).toLowerCase();
        }
        
        // Display command being executed
        Console.println("Running: [" + command + "]");
        
        // Switch on the input command
        switch (command) {
            case "add":
                if (numArgs.size() > 0) {
                    for (Double s : numArgs) {
                        calc.addNum(s);
                    }
                }
                else {
                    Console.println("Not enough arguments!");
                }
                prompt(calc);
                return;
            case "subtract":
                if (numArgs.size() > 0) {
                    for (Double s : numArgs) {
                    	calc.subNum(s);
                    }
                }
                else {
                    Console.println("Not enough arguments!");
                }
                prompt(calc);
                return;
            case "pow":
            	if (numArgs.size() > 0) {
                    for (Double s : numArgs) {
                    	calc.pow(s);
                    }
                }
                else {
                    Console.println("Not enough arguments!");
                }
                prompt(calc);
                return;
            case "exit":
            	System.exit(0);
            case "display":
            	Console.println("Display Value: " + calc.getValue());
            	prompt(calc);
                return;
            default:
                break;
        }
    }

}
