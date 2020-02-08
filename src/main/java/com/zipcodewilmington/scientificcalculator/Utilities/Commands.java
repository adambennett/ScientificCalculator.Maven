package com.zipcodewilmington.scientificcalculator.Utilities;

import com.zipcodewilmington.scientificcalculator.Application.Console;
import com.zipcodewilmington.scientificcalculator.Calculator.Calculator;

import java.util.ArrayList;

public class Commands {

    public static String printCommands() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("Add");
        commands.add("Subtract");

        String toRet = "";
        for (String s : commands) {
               toRet += s + "\n";
        }

        return toRet;
    }

    public static void prompt(Calculator calc) {
        Console.println("Please choose an operation: ");
        Console.println(Commands.printCommands());
        String input = Console.getStringInput("");
        Commands.runCommand(input, calc);
    }

    public static void runCommand(String command, Calculator calc) {
        Console.println("Running command " + command);
        String[] split = command.split("\\s+");
        ArrayList<String> args = new ArrayList<>();
        for (String s : split) { args.add(s); }
        ArrayList<Double> numArgs = new ArrayList<>();
        for (int i = 1; i < args.size(); i++) {
            numArgs.add(Double.parseDouble(args.get(i)));
        }
        if (args.size() > 0) {
            command = args.get(0).toLowerCase();
        }
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

                    }
                }
                else {
                    Console.println("Not enough arguments!");
                }
                prompt(calc);
                return;
            case "pow":
                break;
            default:
                break;
        }
    }




}
